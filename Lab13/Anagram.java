import java.util.Scanner; 

public class Anagram {
  
  
  
  public static void main(String [] args){ 
    Scanner scan = new Scanner(System.in);
    
    System.out.println("First Input");
    String input1 = scan.nextLine();
    
    System.out.println("Second Input");
    String input2 = scan.nextLine();
    
    System.out.println(sort(input1) + " are the letters of "+ input1 +" in order");
    System.out.println(sort(input2) + " are the letters of "+ input2 +" in order");
    
    /** an if loop that prints whether the inputs are an anagram*/
    if(sort(input1).equals(sort(input2))){
      System.out.println(input1 + " is an Anagram of " + input2);
    } else {
      System.out.println(input1 + " is not an Anagram of " + input2);
    }
  }
  
  
  /** sorts input letters from a to z
    * puts it into the empty string*/
  public static String sort(String s){
    
    s = s.toLowerCase(); 
    String order = "";
    
    for(char a='a'; a<'z'; a++ ){
      for(int i=0; i<= s.length()-1; i++ ) {
        if(a == s.charAt(i)){
          order = order + a; 
        }
      }  
    }
    return order;
  }
  
}

