
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Construct the Stack using the array [5, 8, 16, 7, 9] in the main method of your program to test the copyStack and mirror methods.
Write a method copyStack that accepts a stack of integers as a parameter and returns a copy of the original 
stack (i.e. a new stack with the same values as the original, stored in the same order as the original). 
Your method should create the new stack and fill it up with the same values that are stored in the original stack.
When your method is done executing, the original stack must be restored to its original state. Use one queue as auxiliary storage.
Write another method mirror that accepts a stack of integers as a parameter and replace the stack contents
with itself plus a mirrored version of itself (the same elements in the opposite order).

If the stack stores [1, 2, 3]
your method should change it to store
[1, 2, 3, 3, 2, 1]
Use one stack or one queue (but not both) as auxiliary storage to solve this problem.

 */

/**
 * @author Joanna Gromadzka
 * AD 300 - 5204
 * Assignment 5
 * usage of Stack, Queue and auxiliary storage
 */


public class StackMirror {
    public static void main(String[] args) {
        Integer [] a = {5,8,16,7,9};
        Stack<Integer> s = new Stack<>();
        
        //placing array elememnts in stack
        for (Integer nr : a){
            s.push(nr);
        }
        System.out.println("Original stack = " + s);
        copyStack(s);
        //System.out.println("MThe copy stack = "+ copyStack(s));
        mirror(s); 
      //  System.out.println("MThe mirror stack = "+ m);
    }
    
    public static void copyStack(Stack<Integer> s){
        int i;
        int w = s.size();
        
        //created auxiliary queue as storage
        Queue<Integer> q = new LinkedList<>();
       
        //created copy of initial stack
        Stack<Integer> c = new Stack<>();
        
        // move all elements from original stack to queue
        for(i=0 ;i<w; i++){       
            q.add(s.pop());
        }  
                                           
        //all from q to be removed and back to original stack
        while(!q.isEmpty()){
            s.push(q.remove());  
        }
           
        //all from orignal stuck to queue and to copy stuck 
        while(!s.isEmpty()){
            int V=s.pop();  
            c.push(V);
            q.add(V); 
        }  
           
       // remove elements from queue in correct order to original stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }
       
        //System.out.println("Original stack = " + s);
        System.out.println();
        System.out.println("The copy stack = " + c);
        System.out.println();
    }

    private static void mirror(Stack<Integer> s) {
        //created mirror stack 
        Stack<Integer> m = new Stack<>();
        
        //created auxiliary stack as storage
        Stack<Integer> A = new Stack<>();
        
        //made true copies of original stuck without removing elememnts from s 
        for (Integer nr : s){
            A.push(nr);
            m.push(nr);
        }
        
        //remove all elements from aux stack and add them to mirror stack
        while(!A.isEmpty()){
           m.push(A.pop());
        }
        
        System.out.println("Original stack = " + s);
        System.out.println();
        System.out.println("The mirror stack is :" + m);
    }
    
}
