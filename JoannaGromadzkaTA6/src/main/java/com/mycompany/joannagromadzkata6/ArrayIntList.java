/*Construct the Client class using the array [1, 2, 3, 4, 2, 3, 3] in the main method of your program to test the ArrayIntList class’s methods.
Construct the ArrayIntList class with the following additional methods:
Write a method called lastIndexOf that accepts an integers as a parameter and returns the index in the list of the last occurrence of that value, or -1 if the value is not found in the list.  For example, if the list stores [1, 18, 2, 7, 18, 39, 18, 40], then the last index of 18 is 6 and the last index of 3 is -1.
Write another method count that accepts an element value as a parameter and returns the number of occurrences of that value in the list. For example, if the list stores [2, -3, 2, 0, 5, 2, 2, 6]. A call of list.count(2) should return 4 because there are four occurrences of that value in the list.
Write another method removeLast that removes and returns the last value from a list of integer. For example, if a variable called list stores [8, 17, 42, 3, 8], a call of list.removeLast(); should remove 8 and change the list’s state to [8, 17, 42, 3].  The next call would return 3 and remove 3 from the list, and so on.  If the list is empty, throw a NotSuchElementException.
Write another method doubleList that doubles the size of a list by appending a copy of the original sequence to the end of the list.  For example, if the list stores [1, 8, 2, 7], your method should change it to store [1, 8, 2, 7, 1, 8, 2, 7].
 * 
 */
package com.mycompany.joannagromadzkata6;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author szkola
 */
public class ArrayIntList {
    private int[] elementData;
    private int size; 
    public static final int DEFAULT_CAPACITY = 100; 


     
    //constructor
    public ArrayIntList(){
        elementData = new int[10];
        size = 0;
    }
    
    public void add(int value) {   
          elementData[size]= value;
          size++;
    }
    
    //toString method
    public String toString(){
        if (size == 0){
            return "[]";
        
        } else {
            String result = "["+ elementData[0];
            for (int i = 1; i < size; i++){
            result+= ", " + elementData[i];
            }
            result+="]";
            return result;
        }
    } 
    
    public int size(){
        return size;
    }
    
    public int lastIndexOf(int value){
        for(int i = size-1; i >= 0; i--){
            if (elementData[i] == value) {
                return i;
            } 
        }
        return -1;
    }
    
   // public int count(int value){
    public void count(int value){
        int c = 0;
        for (int i = 0; i<=size; i++){
            if (elementData[i] == value){
                c++;
            }
        } System.out.println(c);
            //return c;
    }
    
    //public int removeLast(){
    public void removeLast(){
        if(size==0){
            throw new NoSuchElementException();
        }
       
            int l = elementData[size-1];
                elementData[size-1]=0; 
                size--;
         System.out.println(l);   
       //return l;
    }
    
    //method doubleList that doubles the size of a list by appending a copy of the original sequence to the end of the list.  
   
    public void doubleList(){     
      //create new array with double size of the original array 
      int[] d = new int[2*size];
      //copy original array into new one
        for (int i=0; i<size; i++){
          d[i] = elementData[i];
        }
     
      //loops over original array and appends each element to the end 
      int s = size;
        for (int i=0; i<s; i++){
        d[size]=elementData[i];
        size++;
   
     }
     
     System.out.println(Arrays.toString(d));
       
    }
}
