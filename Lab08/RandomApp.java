import java.util.Scanner;
import java.util.Random;

public class RandomApp{
  
  /** Returns an integer entered by the user
 @param message a prompt to the user
 @return an integer typed by the user*/
public static int readInt(String message){
  Scanner sc = new Scanner(System.in);
  System.out.println(message);
  return sc.nextInt();
}
  public static void main(String[]args){ 
  int lo = readInt("Enter lowest value");
  int hi = readInt("Enter highest value");
  RandomRange r = new RandomRange();
  System.out.println("Random integer between " + lo + " and " + hi + " : " + r.randomRange(lo, hi)); 
  }
} 