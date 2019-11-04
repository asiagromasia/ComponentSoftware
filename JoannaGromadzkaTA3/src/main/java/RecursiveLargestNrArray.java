
import java.util.*;

/*
 * Find the largest number in an array;
Write a recursive method that returns the largest integer in an array. In the main method, prompts user to enter a list of 7 integers,
stores into an array, and displays the largest element.
You will need to use the recursive helper method in here.
To compare 2 numbers to get the larger value, you may use the Math.max( 5, 6), 6 will return.
 */

/**
 *
 * @author Joanna Gromadzka
 * AD 300 - 5204
 * Assignment 3
 * Find the largest number in an array using recursive
 */
public class RecursiveLargestNrArray {
    public static void main(String[] args) {
        
     //create console and allows reading input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter 7 integers: ");
    //create new object array of integers type
    int[] numbers = new int[7];
    //
    for (int i = 0; i<= numbers.length; i++){
    // each new input stores into an array
        numbers[i] = input.nextInt();
    // calling recursive method   
        int lrg = findlargest(numbers);
       System.out.println("The largest element is: " + lrg);
        
        } 
     
    }
    
    //calling method and using helper method
    public static int findlargest(int[] numbers){ 
        return findlargest(numbers,numbers.length);
    } 
    
    private static int findlargest(int[] numbers,int length){
        
        if (length==1) //base case
            return numbers[0];
        else
            
            return lrg(findlargest(numbers, length - 1), numbers[length-1]);
        }
    
    private static int lrg(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
    
      
}

