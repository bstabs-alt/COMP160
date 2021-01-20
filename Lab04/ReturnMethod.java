public class ReturnMethod{
  
  public static void main(String[]args){
    System.out.println (fMethod(cMethod()));
    
  }
  
  public static String fMethod(String s){
    return s + "*" + s;
  }


  public static String cMethod(){
    return "coffee";
  }
}

