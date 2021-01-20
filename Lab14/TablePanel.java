import javax.swing.*;
import java.awt.*;

/*sets dimensions and colour of tablepanel
 * sets position and name and number of instances of diner */
public class TablePanel extends JPanel {
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  public TablePanel () {
    setPreferredSize(new Dimension(350,350));
    setBackground(Color.yellow);
    diner1 = new Diner (150, 45, "Yoda", 1);
    diner2 = new Diner (205, 120, "Luke", 2);
    diner3 = new Diner (205, 180, "Han", 3);
    diner4 = new Diner (150, 255, "Darth", 4);
    diner5 = new Diner (95, 180, "Leia", 5);
    diner6 = new Diner (95, 120, "Anakin", 6);
  }
  
  /* draws diners on page
   * sets the rectangle size and colour */
  public void paintComponent (Graphics page){
    super.paintComponent(page);
    diner1.draw(page);
    diner2.draw(page);
    diner3.draw(page);
    diner4.draw(page);
    diner5.draw(page);
    diner6.draw(page);
    page.setColor (Color.black);
    page.fillRect (150, 100, 50, 150);
  }
}