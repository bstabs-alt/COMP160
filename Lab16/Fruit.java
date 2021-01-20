import java.util.Scanner;

public class Fruit{
  
  public static void main(String [] args){
   
    /**Array of fruits that holds 3 integers
      * for loop fills array with the fruit that the user has inputted with the scanner*/
    String [] fruits = new String [3];
    
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < fruits.length; i++){
      System.out.println("Enter a fruit: ");
      fruits[i] = sc.nextLine();
    }
    
    /**foreach loop to print out the first 2 letters of the fruits from the array
      * nested with a while an if loop that if the guess is correct then ruturns with correct else incorrect*/
    for (String eachFruit: fruits){

      String guess;
      do{
        System.out.println("Guess what fruit I am? "+eachFruit.substring(0,2)+"\t"+eachFruit.length() + " letters");
        guess = sc.nextLine();
        if(!guess.equals(eachFruit)){
          System.out.println("Incorrect");
        }
      }while (!guess.equals(eachFruit));
      
      System.out.println("Correct\n");
    }
  }
}