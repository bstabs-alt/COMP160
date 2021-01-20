import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2019 
 */
public class Pie extends JPanel{
  /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
  
  
  /** all drawing code goes in the paint method, which is called automatically*/
  public void paintComponent (Graphics page){
    super.paintComponent(page); 
    final int LEFT = 0; // horizontal
    final int TOP = 0; // top vertical
    final int SIZE = 300; // size of pie chart
    final int ARC = 45; // the angle of the arc
    // sets the slice positions and colour around the pie chart
    page.setColor (Color.black);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 0, ARC); 
        page.setColor (Color.blue);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 45, ARC);
        page.setColor (Color.cyan);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 90, ARC);
        page.setColor (Color.red);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 135, ARC);
        page.setColor (Color.white);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 180, ARC);
        page.setColor (Color.green);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 225, ARC);
        page.setColor (Color.magenta);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 270, ARC);
        page.setColor (Color.orange);
    page.fillArc (LEFT, TOP, SIZE, SIZE, 315, ARC);
    
  }
}
