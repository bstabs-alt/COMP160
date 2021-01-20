import javax.swing.*;

  /** Creates instances of the class JFrame and TablePanel
    * and allowing the printout of the table*/
public class DinerApp {
  public static void main(String [] args){
    JFrame frame = new JFrame("Diner");
    TablePanel table = new TablePanel();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add (table);
    frame.pack();
    frame.setVisible(true);
  }
  
  
  
}