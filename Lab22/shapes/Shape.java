package shapes;
import java.util.Random;
import java.awt.*;


public class Shape{
  private int x, y, width, height ,moveX = 1, moveY = 1, z = 0;
  Color  color;
  
  /*Returns random Integers to be used for the data fields*/
  public int randomRange( int lo, int hi){
    Random rand = new Random(); 
    return(rand.nextInt(hi)+lo);
  }
  /* makes the data fields random values*/
  public Shape(){
    width = randomRange(10,30);
    height = width;
    x = randomRange(0, (400-width));
    y = randomRange(0, (400-width));
    color = new Color(randomRange(0,255),randomRange(0,255),randomRange(0,255));
  }
  
  /*draws circle*/
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x,y,width,height);
  }
  
  /* x y location set to moveX and Y, so they move 1 pixel for whatever the timer delay is set to in ShapePanel
   * if either x or y go below 0 or over 400, MoveX and Y are set to z which makes their direction change and speed up*/
  public void move(){
    x += moveX;
    y += moveY;
    
    if(x <= 0){
      z = z +2;
      moveX = z;
    } else if (x >= 400){
      z = z -2;
      moveX = z;
    }
    
    if(y <= 0){
      z = z +2;
      moveY = z;
    } else if (y >= 400){
      z = z -2;
      moveY = z;
    }
    
  }
}