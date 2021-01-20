public class Box {
  public int height, width, length;  //data fields for box dimensions
  private static String ownersName;//data field for the Owners Name
  
//constructor for the box dimension data fields
  public Box (){}
  
  public Box(int h, int w, int l){
    this.height = h;
    width = w;
    length = l;
  }
  /**constructor to set all dimensiosn the same*/
  public Box(int side){
    height = side;
    width = side;
    length = side;
  }
  
  /**sets the value of the data field ownersName to input parameter value
    *@param o owners name */
  public static void setOwnersName (String o) {
    ownersName = o; 
   
  }
  
  /**returns the value of the data field ownersName 
    *@return the owners name*/
  public static String getOwnersName (){
    return ownersName;
  }
  
  /**sets the value of the data field height to input parameter value
    *@param h height */
  public void setHeight(int h){      
    height = h;  
  }
  
  /**sets the value of the data field width to input parameter value
    *@param w width */
  public void setWidth(int w){      
    width = w;  
  }
  /**sets the value of the data field length to input parameter value
    *@param l length */
  public void setLength(int l){      
    length = l;  
  }
  
  /**returns the value of the data field surfaceArea 
    *@return the surface area*/
  public int getSurfaceArea(){ 
 
    return 2 * (height * width) + 2 * (height * length) + 2 * (width * length);
  } 
  
  /**returns the value of the data field volume 
    *@return the volume*/
  public int getVolume(){   
    
    int volume = height * width * length;
    return volume ;  
    
  } 
  /**returns the value of all data fields 
    *@return the data fields*/
  public String toString (){
    return 
      "Owned by:" + getOwnersName() + "Height:" + height + " Width:" + width + " Length:" + length +
      " Surface Area:" + getSurfaceArea() + " Volume:" + getVolume(); 
  }
} 
