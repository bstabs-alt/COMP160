public class Customer {
  private String name;// sets the data fields
  private boolean child;
  private boolean student;
  private boolean booked;
  
  public Customer(){}
  public Customer (String nameIn, int age, boolean studentIn){
    this.name = nameIn;
    this.child = (age >= 5 && age <= 16);
    this.student = studentIn;
  }// intialises the data fields
  
      /**returns the value of the data field name
   *@param getName */
  public String getName(){
    return name;
  }
      /**returns the value of the data field child
   *@param isChild */
  public boolean isChild(){
    return child;
  }
      /**returns the value of the data field student
   *@param isStudent */
  public boolean isStudent(){
    return student;
  }
      /**returns the value of the data field booked
   *@param isBooked */
  public boolean isBooked(){
    return booked;
  }
  /**sets the value of the data field booked to input parameter value b
   *@param b booked */
  public void setBooked(boolean b){
    booked = b;
  }
  
}