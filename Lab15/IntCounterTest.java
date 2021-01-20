import java.util.*;
import java.text.*;

public class IntCounterTest{
  
  
  public static void main(String [] args){
    
    double rand = Math.random() * (10 - 5 + 1) + 5;
    int [] numArray = new int [(int) rand];
 
    for(int i = 0; i < numArray.length; i = i +1){
      numArray[i] = (int)(Math.random()*4);
      System.out.print(numArray[i] + " ");
    }
    
    System.out.print( "array is of length " + (int) rand);
  
  }
  
}