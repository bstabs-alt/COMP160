package shapes;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*Makes the main panel and all the buttons, labels, and timer*/
public class ShapePanel extends JPanel{
  private Shape [] shapes = new Shape [20]; //Array used to store 20 objects of shape
  private JPanel controlPanel;
  private DrawingPanel drawPanel;
  private JButton addShape = new JButton("Add Shape");
  private JButton start = new JButton("Start");
  private JButton stop = new JButton("Stop");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count: ");
  private int count;
  Timer timer;
  private final int DELAY = 5;
  
  /*adds the listener for functionality of buttons*/
  public ShapePanel(){
    controlPanel = new JPanel();
    drawPanel = new DrawingPanel();
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    start.addActionListener(listener);
    stop.addActionListener(listener);
    timer = new Timer(DELAY, listener);
    controlPanel.setPreferredSize(new Dimension (100,400));
    
    controlPanel.add(addShape);
    controlPanel.add(start);
    controlPanel.add(stop);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    add(controlPanel);
    add(drawPanel);
  } 
  
  
  /* timer to make the shapes move their x and y postions from move()
   * if shape was pressed and if so add a shape and increase the shape count
   * start and stop buttons which halts timer */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==timer){  
          for (int i = 0; i < count; i++){
            shapes[i].move();
        }
      } else if(e.getSource()==addShape){
        if(count < shapes.length){
          shapes[count] = new Shape();
          count++;
        }
      } 
      if(e.getSource()==stop){
        timer.stop();
      } else if (e.getSource()==start){
        timer.start();
      }
      showNum.setText(Integer.toString(count));
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