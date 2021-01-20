public class TwoDimensionalArrays{
  
  public static void main(String [] args){
    
    //array that holds 12 columns and 12 rows*/
    int [][] array2D = new int [15][12];
    //Fills rows and columns with data*/
    for(int i = 0; i < array2D.length; i++){
      for(int x = 0; x < array2D[i].length; x++){
        array2D[i][x] = (i+1)*(x+1);
      }
    }
    
    /**prints the data in order of position 0-11 for rows and columns*/
    for(int i = 0; i <array2D.length; i++){
      for(int x = 0; x <array2D[i].length; x++){
        System.out.print(array2D[i][x]+"\t");
      }
      System.out.println();
    }
  }
}