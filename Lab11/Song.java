public class Song {
  private String songLine; // data field
  
  //constructor for the songLine data fields
  public Song (String sLine){
    songLine = sLine;
  }
  
  /**returns the value of all data fields 
    *@return the data fields*/
  public String toString (){
    return songLine; 
  }
  
  /** calls methods to interact with strings related to the constructor songLine
    * process */
  public void process(){
    
    System.out.println( "Length: " + songLine.length());
    System.out.println("Last: " + songLine.charAt(songLine.length()-1));
  
    int firstSpace = songLine.indexOf(' ');
    int secondSpace = songLine.indexOf(' ', firstSpace + 1);
   
    if (secondSpace != -1 ){
    System.out.println("first two words: " + songLine.substring(0, firstSpace) + "\n" + songLine.substring(firstSpace, secondSpace) + "\n" + songLine.substring(secondSpace, songLine.length()));           
    System.out.println("3rd word 1st letter: " + songLine.charAt(secondSpace + 1));
    }
    System.out.println("UpperCase: " + songLine.toUpperCase());
    System.out.println("replace to x: " + songLine.replace(' ', 'x'));
    System.out.println("first b: " + songLine.indexOf('b'));
    System.out.println("reiteration: " + songLine);
  }
  
  
}