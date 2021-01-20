package shapes;
import java.awt.*;

public class Smiley extends Shape{
  
  public Smiley(){
    y = randomRange(0, 400 - height);
    x = randomRange(0, (400-width));
  }
  
  /*draws smile*/
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x,y,30,30);
    g.setColor(color.black);
    g.fillOval(x+7,y+8,4,4); // left eye
    g.fillOval(x+20,y+8,4,4); // right eye
    g.drawArc(x + 8, y + 10, 15, 13, 190, 160); // smile
  }
  
}