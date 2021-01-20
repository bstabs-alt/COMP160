import javax.swing.*;
import java.awt.*;
/**
 * SnowmanPanel.java       From: Lewis, DePasquale & Chase page 971 (page 835 2nd edition)
 * 
 * Demonstrates basic drawing methods and the use of color.
 * 
 */



public class Lab5 extends JPanel{
  
  public void paintComponent (Graphics page) {
   
    page.drawOval (50, 50, 20, 20);  
    page.setColor (Color.blue);
    page.fillOval (50, 50, 20, 20);
  }
  
  public static void main(String[] args) {
    Lab5 rects = new Lab5();
    JFrame frame = new JFrame("Lab5");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(rects);
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
