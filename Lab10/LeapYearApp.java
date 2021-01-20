public class LeapYearApp{
  /** calls the leapYear method for the specific inputs*/
  public static void main(String [] args){
    leapYear(2018); 
    leapYear(2020);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }
  /** determines if the input is a leap year, when divisble by certain integers*/
  public static void leapYear(int year){
    if (year < 1582) System.out.println(year + " Predates Gregorian Calendar");
    else {
      if (((year % 4) == 0) && ((year % 100) == 0) && ((year % 400) == 0))
        System.out.println(year + " Leap Year");
      
      else if (((year % 4) == 0) && ! ((year % 100) == 0) && ! ((year % 400) == 0))
        System.out.println(year + " Leap Year");
      
      else
        System.out.println(year + " Not a Leap Year");
    }
  }
  
}