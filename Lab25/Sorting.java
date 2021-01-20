import java.util.ArrayList;

/*Implements a selection sorting algorithm on an ArrayList.*/
public class Sorting {
  
  public static void main(String[] args){
    
    ArrayList <Integer> arraySort = new ArrayList <Integer> ();//arrayList
    
    for (int i = 1; i <= 5; i++){
      arraySort.add( (int)(Math.random() * 9 + 1) );//puts a random integer between 1 and 9 in the array
    }
    
    System.out.println("Unsorted Array:");
    for(int i = 0; i < arraySort.size(); i++){
      System.out.print(arraySort.get(i));//print each index value in unsorted array
    }
    System.out.println();
    
    
    for (int i = 0; i < arraySort.size(); i++){//Goes through each index position in the array
      int temp = 0;//used to hold a index value that will be swapped with a smaller index value
      for (int j = i + 1; j < arraySort.size(); j++){//j becomes the  i index position + 1
        if(arraySort.get(i) > arraySort.get(j)){ // if the value in i is greater than the value in j then swap them
          temp = arraySort.get(i); //temp holds the i index value
          arraySort.set(i,arraySort.get(j)); //the i index value gets overwritten with the j index value
          arraySort.set(j, temp); // the j index value is overwritten by the temp value which is the originally i index value
        }
      }
    }
    
    
     System.out.println("Sorted Array:");
    for(int i = 0; i < arraySort.size(); i++){
      System.out.print(arraySort.get(i));//print each index value in sorted array
    }
    
    
    
  }
}