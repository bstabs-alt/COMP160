public class Average{
  
  /** displays the row and average for each row 
    * for loop creates sum and adds to sum*/
  public static void main(String[]args){
    
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    
    for (int row = 0; row<table.length; row ++){
      int sum = 0;
      for (int col = 0; col <table[row].length; col ++){
        System.out.print(table[row][col]+" ");
        sum = sum + table[row][col];
      }
      System.out.println("\t Average : "+((double) sum/(table[row].length)));
      System.out.println();
    }
    
    
    for(int [] row: table){
      int sum = 0;
      for(int num: row){
        System.out.print(num +" ");
        sum = sum + num;
        
      } 
      System.out.println("\t Average : "+((double) sum/row.length));
      System.out.println();
    }
  }
}