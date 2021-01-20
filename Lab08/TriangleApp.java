import java.text.*;

public class TriangleApp {
  
  public static void main(String [] args){
    DecimalFormat dFour = new DecimalFormat("0.##"); // sets deciaml point
    
    Triangle a = new Triangle(0,3,3,4,1,9,"A"); // sets data point positions
    System.out.println("Triangle " + a.getName()+ " perimeter is " + dFour.format(a.getPerimeter()) + " units"); // outputs perimeter
    Triangle b = new Triangle(4,2,9,4,6,7,"B");
    System.out.println("Triangle " + b.getName()+ " perimeter is " + dFour.format(b.getPerimeter()) + " units");
    Triangle c = new Triangle();
    System.out.println("Triangle " + c.getName()+ " perimeter is " +dFour.format(c.getPerimeter()) + " units");
  }
}