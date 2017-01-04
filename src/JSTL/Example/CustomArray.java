package JSTL.Example;

import java.util.Arrays;

public class CustomArray {

 
    private Object[] myDataArray;
    private int actSize = 0;
     
    public CustomArray(){
        myDataArray = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myDataArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        if(myDataArray.length-actSize <= 5){
            increaseListSize();
        }
        myDataArray[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = myDataArray[index];
            myDataArray[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myDataArray[tmp] = myDataArray[tmp+1];
                myDataArray[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myDataArray = Arrays.copyOf(myDataArray, myDataArray.length*2);
        System.out.println("\nNew length of Array: "+myDataArray.length);
    }
     
    public static void main(String a[]){
    	CustomArray cArrat = new CustomArray();
        cArrat.add(new Integer(2));
        cArrat.add(new Integer(5));
        cArrat.add(new Integer(1));
        cArrat.add(new Integer(23));
        cArrat.add(new Integer(14));
       
        cArrat.add(new Integer(29));
        
        System.out.println("Size of the Array : "+cArrat.size());
        
        System.out.println("Element at Index 5:"+cArrat.get(2));
        
        System.out.println("Remove third Element from Array "+cArrat.remove(3));
      
    }
}
