
import javax.swing.*;
/*Application to display the trafficlightpanel */
public class TrafficLightApp{
  public static void main(String [] args){
    JFrame frame = new JFrame("Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TrafficLightPanel());
    frame.pack();
    frame.setVisible(true);

  }
}
