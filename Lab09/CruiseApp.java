import java.util.*;
import java.text.*;
/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  public static void main(String[]args){
    
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    
    /**outputs for each specific customer
   *@param confirmBooking */
    confirmBooking(customer1); 
    confirmBooking(customer2);
    confirmBooking(customer3);
    confirmBooking(customer4);
    confirmBooking(customer5);
    confirmBooking(customer6);
    confirmBooking(customer7);
    confirmBooking(customer8);
    
    /**outputs for each booked customer
   *@param showBooked */
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);
  }
    /**sets the discounts for customers, and displays the cost and allows for an input if they want to book.
   *@param confirmBooking */
  public static void confirmBooking (Customer customer){
    DecimalFormat dTwo = new DecimalFormat("0.##"); // sets deciaml point
    double ticket = 56.0;
    double meal = 30.0;
    if (customer.isStudent()  || customer.isChild() ) ticket = ticket * 0.5;
    else ticket = ticket * 0.8;
    if (customer.isChild() ) meal = meal * 0.5; 
    else  meal = meal * 0.9;  
    
    System.out.println("\n" + customer.getName() + " Child:" + customer.isChild() + " Student:" + customer.isStudent());
    System.out.println("Ticket price:$"  + dTwo.format(ticket) + "\nMeal price:$" + dTwo.format(meal) + "\nTotal price:$" + dTwo.format((ticket + meal))); 
    System.out.println("Confirm booking for " + customer.getName() + "(Y/N)"); 
    Scanner scan = new Scanner(System.in);
    String  yesORno = scan.nextLine();
    if (yesORno.equals( "y") || yesORno.equals("Y")) {
      System.out.println("booked: " + customer.getName() + "\n");
      customer.setBooked(true);
    }
  }
    /**displays all customers who have booked
   *@param showBooked */
  public static void showBooked (Customer customer){
    if (customer.isBooked()){
      System.out.println(customer.getName() + " is booked");
    }
  }
  
}