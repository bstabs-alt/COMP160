public class BoxApp {
  public static void main(String [] args){
    Box.setOwnersName("Jim ");
    
    System.out.println(Box.getOwnersName());
    Box box1 = new Box();
    box1.setHeight(4);
    box1.height = 8;
    box1.setWidth(4);
    box1.setLength(6);
    System.out.println(box1.toString());
    Box box2 = new Box(3, 4, 5);
    System.out.println(box2.toString());
    Box box3 = new Box(5);
    System.out.println(box3.toString());
    Box box4 = new Box(7);
    System.out.println(box4.toString());
    Box.setOwnersName("Bob ");
    System.out.println(box1.toString());
    System.out.println(box2.toString());
    System.out.println(box3.toString());
    System.out.println(box4);
  }
}