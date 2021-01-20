import java.util.*;
import java.text.*;

public class IntCounter{
  
  private int[] numArray; // array of int of type int[]
  
  
  /*takes array int as a parameter
   * foreach which displays the elemnts of the array*/
  public IntCounter (int[] numArray){
    
    this.numArray = numArray;
    for(int num: numArray){
      System.out.print(num+" ");
    }
    System.out.print("Array is of length: "+numArray.length+"\n");
    
  }
  
  /*takes int target as a parameter
   * produces the inde position of the target value in the array*/
  public void showTarget(int target){
    for(int i = 0; i < numArray.length; i++){
      if (numArray[i]==target){
        System.out.println("\tThere is a "+target+" in position "+i);
      }
    }
    System.out.println();
  }
}

