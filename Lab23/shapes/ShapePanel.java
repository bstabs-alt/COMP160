package shapes;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*Makes the main panel and all the buttons, labels, and timer*/
public class ShapePanel extends JPanel{
  private Shape [] shapes = new Shape [20]; //Array used to store 20 objects of shape
  private JPanel controlPanel;
  private DrawingPanel drawPanel;
  private JButton[] buttons = new JButton[7];
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count: ");
  private int count;
  Timer timer;
  private final int DELAY = 5;
  
  /* adds control panel, draw panel, buttonListener, timer, and count
   * foreach loop that adds a listener for each button and adds each button to the control panel*/
  public ShapePanel(){
    controlPanel = new JPanel();
    drawPanel = new DrawingPanel();
    
    
    ButtonListener listener = new ButtonListener();
    buttons[0] = new JButton("circle");
    buttons[1] = new JButton("square");
    buttons[2] = new JButton("oval");
    buttons[3] = new JButton("smiley");
    buttons[4] = new JButton("swirl");
    buttons[5] = new JButton("start");
    buttons[6] = new JButton("stop");
    
    for(JButton eachbuttons : buttons){
      eachbuttons.addActionListener(listener);
      controlPanel.add(eachbuttons);
    }
    
    timer = new Timer(DELAY, listener);
    controlPanel.setPreferredSize(new Dimension (100,400));
    
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel);
    add(drawPanel);
  } 
  
  
  /* timer to make the shapes move their x and y postions from move()
   * if any buttons in the array are pressed then they will added to a maximum of 20
   * start and stop buttons which start and halts timer */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==timer){  
        for (int i = 0; i < count; i++){
          shapes[i].move();
        }
      } else {
        JButton button = (JButton) e.getSource();
        
        if(button.getText().equals("circle")){
          if(count < shapes.length){
            shapes[count] = new Circle();
            count++;
          }
        }  
        if(button.getText().equals("square")){
          if(count < shapes.length){
            shapes[count] = new Square();
            count++;
          }
        }  
        if(button.getText().equals("oval")){
          if(count < shapes.length){
            shapes[count] = new Oval();
            count++;
          }
        }  
        if(button.getText().equals("smiley")){
          if(count < shapes.length){
            shapes[count] = new Smiley();
            count++;
          }
        }  
        if(button.getText().equals("swirl")){
          if(count < shapes.length){
            shapes[count] = new Swirl();
            count++;
          }
        } 
        if(button.getText().equals("stop")){
          timer.stop();
        } 
        else if(button.getText().equals("start")){
          timer.start();
        }
        
        showNum.setText(Integer.toString(count));
        
      }
      
      repaint();
    }
  }
  /*draws the panel where shapes go*/
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setPreferredSize(new Dimension (400,400));
      setBackground(Color.pink);
    }
    /*calls the display method of shapes, paints the shapes*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0; i < count; i++){
        shapes[i].display(g);
      }
    }
  }
}
