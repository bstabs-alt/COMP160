package shapes;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/*Makes the main panel and all the buttons, labels, and timer*/
public class ShapePanel extends JPanel{
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private JPanel controlPanel;
  private DrawingPanel drawPanel;
  private JButton[] buttons = new JButton[8];
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Remove which?");
 
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
    buttons[7] = new JButton("remove");
    
    
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
   * if any buttons in the array are pressed then they will added
   * start and stop buttons which start and halts timer java 
   Remove Button which removes the shape depending on what number is in the JTextField*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==timer){  
        for (int i = 0; i < shapes.size(); i++){
          shapes.get(i).move();
        }
      } else {
        JButton button = (JButton) e.getSource();
        
        if(button.getText().equals("circle")){      
          shapes.add(new Circle());
   
        }  
        if(button.getText().equals("square")){
          shapes.add(new Square());
       
        }  
        if(button.getText().equals("oval")){
          shapes.add(new Oval());
          
        }  
        if(button.getText().equals("smiley")){
          shapes.add(new Smiley()); 
          
        }  
        if(button.getText().equals("swirl")){
          shapes.add(new Swirl());
          
        } 
        if(button.getText().equals("stop")){
          timer.stop();
        } 
        if(button.getText().equals("start")){
          timer.start();
        } 
        
        if(button.getText().equals("remove")){
          try{
            int showNumValue = Integer.parseInt(showNum.getText());
            shapes.remove(showNumValue);
          } catch (NumberFormatException exception) {
            System.out.println("requires a number");
            
          } catch (IndexOutOfBoundsException exception) {
            System.out.println("requires a smaller number");
          }
        }
        if(shapes.size() == 0){
          showNum.setText("");
        } else {
          showNum.setText(Integer.toString((shapes.size()-1)));
        }
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
      for(int i = 0; i < shapes.size(); i++){
        shapes.get(i).display(g);
        shapes.get(i).showIndex(g, i);
      }
    }
  }
}
