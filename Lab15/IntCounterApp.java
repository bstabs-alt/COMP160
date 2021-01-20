import java.util.*;
import java.text.*;

public class IntCounterApp{
  
  /* for loop promts the user 3 times for which random number they wish to find inin the array
   * makes the next array from count
   calls showTarget method of the instance, sending it to target integer*/
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    
    for(int i = 0 ; i < 3; i++) {
      
      System.out.println("Which number do you wish to find?") ;
      int input = scan.nextInt();
      IntCounter count = new IntCounter(makeArray());
      count.showTarget(input);
    }
    
    System.out.println("Finished!");
    
  }
  
  /*creates random sized array between 5-10
   * fills array with rnadom number between 0-4
   returns the array*/
  public static int [] makeArray(){
    
    double rand = Math.random() * (10 - 5 + 1) + 5;
    int [] x = new int [(int) rand];
    for(int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random()*5);
    }
    return x; 
  }
  
}