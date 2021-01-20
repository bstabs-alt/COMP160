package shapes;
import java.util.Random;
import java.awt.*;


public abstract class Shape{
  protected int x, y, width, height ,moveX = 1, moveY = 1;
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
  public abstract void display(Graphics g);
  
  /* x y location set to moveX and moveY, so they move 1 pixel for whatever the timer delay is set to in ShapePanel*/
  public void move(){
    x += moveX;
    y += moveY;
    
    if(x <= 0 ){
      moveX++;
    } else if (x >= 400-width ){
      moveX--;
    } 
    
    if(y <= 0){
      moveY++;
    } else if (y >= 400-height){
      moveY--;
    }
    
  }
}