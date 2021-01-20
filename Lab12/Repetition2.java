import java.util.Scanner; 

public class Repetition2{
  
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Text"); 
    String input = scan.nextLine();
    int vowelCount = 0, consenantCount = 0, i = 0;
    input = input.toLowerCase();
    
    while (i < input.length()){
      char ch = input.charAt(i);
      switch (ch)
      {
        case 'a': 
        case 'e':  
        case 'i': 
        case 'o': 
        case 'u': ++vowelCount;
        break;
        default:
          if (ch >= 'a' && ch <= 'z')
          ++consenantCount;
          break;
      }
      i++;
    }
    System.out.println("Vowel Count: " + vowelCount + "\n" + "Consenant Count: " + consenantCount); 
  }
}