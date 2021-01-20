import java.awt.*;

public class Diner {
  private int x, y, seatNum;
  private String name;
  private Color colour;
  private final int DIAMETER = 50;
  
  /*constuctor that intitialises x, y, name, and seatNum
   * SeatNum swaps between gray nad white depending on if seat number is % 2*/
  public Diner(int x, int y, String name, int seatNum){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum; 
    
    if(seatNum % 2 == 0){ colour = Color.gray; } 
    else { colour = Color.white; }
  }
  /*sets dimensions of the diners, 
   * sets default colour colour, and font and position of the names and seat numbers for the diners */
  public void draw(Graphics g){
  g.setColor(colour);
  g.fillOval (x, y, DIAMETER, DIAMETER);

  g.setColor (Color.black);
  g.setFont(new Font("Courier", Font.PLAIN, 12));
  g.drawString(name,x+10 ,y+25 );
  g.drawString(Integer.toString(seatNum),x+20 ,y+38 );
  }
  
  
}