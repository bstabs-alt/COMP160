package shapes;
import java.awt.*;

public class Circle extends Shape{
    
  /*draws circle*/
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x,y,width,height);
  }
  
}