/** Nathan Laing
  * COMP160
  * August, 2017
  * Two Dimensional Arrays
  * Part 1
  */
import java.util.Scanner;

public class FruitArray{
  
  public static void main(String [] args){
    /**Sets up an array of fruits to be entered and tested*/
    String [] fruits = new String [3];
    /**Sets up a scanner so user can enter fruits*/
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < fruits.length; i++){
      System.out.println("Please enter a fruit: ");
      fruits[i] = sc.nextLine();
    }
    for (String s: fruits){
      System.out.println("Guess what fruit I am? "+s.substring(0,2)+"\t"+s.length());
      boolean guessing = true;
      while (guessing){
        String guess = sc.nextLine();
        if(guess.equals(s)){
          System.out.println("Correct!");
          guessing = false;
        }
        else{
          System.out.println("Try again! :( ");
        }
      }
    }
  }
}