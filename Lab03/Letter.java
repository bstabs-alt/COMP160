import java.util.Scanner;
/** 
 * Lab 3, COMP160, 2019
 */

public class Letter{
  private static String yours = "Yours sincerely";
  private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
  
  public static void main(String [] args){
    String name;
    Scanner scan = new Scanner (System.in); //makeascannerobjectsc
    System.out.println("Name please");
    name = scan.nextLine (); // sets name to be inputted with keyboard
    int junior = 30000;     // standard pay rate for Junior employee
    int intermediate = 40000;  // standard pay rate for Intermediate employee
    int senior = 60000;    // standard pay rate for Senior employee
    jobOffer();
    jobOffer("Astronaut");
    jobOffer("Lawyer", intermediate);
    jobOffer("John Smith", "Smith", junior);
    jobOffer(name, "Smith", junior);
  } // end method
  
  
  public static void signature() {
    System.out.println(yours + "\n" + sign + "\n");
  } // allows for jobOffer to easily call signature
  
  /** displays a job offer for Bottle Washer at $25K */
  public static void jobOffer(){
    System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
    signature();
  } // end method
  
  /** displays a job offer with Job title */
  public static void jobOffer (String jobtitle){ 
    System.out.println("Dear applicant\nI wish to offer you the position of " +
                       jobtitle + ".\nThe pay rate will be $50000 per annum."); 
    signature();
  } // end method
  
    /** displays a job offer with job title and a payrate */
  public static void jobOffer (String jobtitle, int payrate){ 
    System.out.println("Dear applicant\nI wish to offer you the position of " +
                       jobtitle + ".\nThe pay rate will be $" + payrate + " per annum."); 
    signature();
  } // end method
  
  /** displays a job offer with the name of th applicant, the job title and the payrate */
  public static void jobOffer (String name, String jobTitle, int payrate){ 
    System.out.println("Dear "+ name +"\nI wish to offer you the position of " +
                       jobTitle + ".\nThe pay rate will be $"+ payrate +" per annum."); 
    signature();
  } // end method
  
} // end class