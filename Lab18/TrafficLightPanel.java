import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**Main panel-Has the Traffic lights and buttons drawn onto it*/
public class TrafficLightPanel extends JPanel{
  private JButton redButton, amberButton, greenButton;
  private JLabel buttonLabel, lastPressedLabel;
  private JPanel buttonPanel;
  
  /**sets up GUI*/
  public TrafficLightPanel(){
    //puts text on the buttons
    redButton = new JButton("Red");
    amberButton = new JButton("Amber");
    greenButton = new JButton("Green");
    //Sets up a Label for the button panel and a label to check the last pressed button
    buttonLabel = new JLabel("Buttons");
    lastPressedLabel = new JLabel("");
    //Adds listener objects to each button
    ButtonListener listener = new ButtonListener();
    redButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    greenButton.addActionListener(listener);
    
    //Panel with Button Label and the buttons and sets dimensions and colours
    buttonPanel = new JPanel();
    setPreferredSize(new Dimension (200,300));
    buttonPanel.setBackground(Color.blue);
    buttonPanel.setPreferredSize(new Dimension (80,290));
    setBackground(Color.white);
    buttonPanel.add(buttonLabel);
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    add(buttonPanel);
    LightPanel light = new LightPanel();
    add(light);
  }
  
  /**listener object events, stes ast pressed*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==redButton){
        lastPressedLabel.setText("red");
       // buttonPanel.setBackground(Color.red);
      }
      else if(e.getSource()==greenButton){
        lastPressedLabel.setText("green");
       // buttonPanel.setBackground(Color.green);
      }
      else if(e.getSource()==amberButton){
        lastPressedLabel.setText("amber");
      //  buttonPanel.setBackground(Color.orange);
      }
      //repaint so color can change
      repaint();
    }
  }
  
  /**if statements paint color based on which is pressed*/
  private class LightPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillOval(20,40,40,40);
      g.fillOval(20,120,40,40);
      g.fillOval(20,200,40,40);
      if(lastPressedLabel.getText().equals("red")){
        g.setColor(Color.red);
        g.fillOval(20,40,40,40);
      }
      else if(lastPressedLabel.getText().equals("green")){
        g.setColor(Color.green);
        g.fillOval(20,200,40,40);
      }
      else if(lastPressedLabel.getText().equals("amber")){
        g.setColor(Color.orange);
        g.fillOval(20,120,40,40);
      }
    }
    
    /**sets colour and size of lightpanel*/
    public LightPanel(){
      setPreferredSize(new Dimension (80,290));
      setBackground(Color.cyan);
    }
  }
}

