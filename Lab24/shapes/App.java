package shapes;
import javax.swing.*;

public class App {
  /*makes everything displayed*/
  public static void main(String [] args){
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
  
}