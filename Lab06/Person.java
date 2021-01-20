public class Person{ 
  private int age;
  private String name, country_of_origin;
  
  public void methodOne(int ageIn){ 
    age = ageIn;
  }
  
  public void methodTwo(String nameIn, String originIn){
    name = nameIn;
    country_of_origin = originIn;
  }
  
  public int methodThree(){ return age;
  }
  
  public void methodFour(){
    System.out.println(name + " " + country_of_origin);
  }
  
  public String methodFive(){ 
    return country_of_origin;
  }
  
  public void methodSix(){
    int birthyearApprox = 2019 – age;
  }
}

public class PersonApp{
  public static void main(String[]args){
    Person person1 = new Person();
    person1.methodOne(19);
    person1.methodTwo("Brian Berry", "Ireland");
    System.out.println("Age is " + methodThree()); 
  } 
}
