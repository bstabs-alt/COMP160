public class Triangle {
  private int p1x, p1y, p2x, p2y, p3x, p3y; // provides the data points within the class
  private String name;
  
  public Triangle(){
  
    p2x=3;
     
    p3x=3;
    p3y=4;
    name="test";
  }
  
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn) {
    this.p1x = pt1x;
    this.p1y = pt1y;
    this.p2x = pt2x;
    this.p2y = pt2y;   
    this.p3x = pt3x;
    this.p3y = pt3y; 
    this.name = nameIn;
  } // intialises the data points
  
  
  
  /**Calculates the side of a triangle
    *@param calcSide x1, y1, x2, y2 */
  private double calcSide(int x1, int y1, int x2, int y2){ 
    return Math.sqrt( (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)) );
  }
  
  
  /**Calculates the periemter of a triangle
    *@param get Periemter calcSide + calcSide + calcSide */
  public double getPerimeter(){
    return calcSide(p1x,p1y,p2x,p2y) + calcSide(p2x,p2y,p3x,p3y) + calcSide(p3x,p3y,p1x,p1y);
  } 
  
  /**returns the value of the data field name
    *@param getName */
  public String getName(){
    return name;
  }
  
}