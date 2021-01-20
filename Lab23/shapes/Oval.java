package shapes;
import java.awt.*;

public class Oval extends Shape{
  
  public Oval(){
    width = 4 * height; 
    x = randomRange(0, 400 - width);
  }
  
  
  /*draws oval*/
  public void display(Graphics g){
    

    
    g.setColor(color);
    g.fillOval(x,y,width,height);
    
  }
  
}