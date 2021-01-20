package shapes;
import java.awt.*;

public class Square extends Shape{
    
  /*draws square*/
  public void display(Graphics g){
    g.setColor(color);
    g.fillRect(x,y,width,height);
  }
  
}