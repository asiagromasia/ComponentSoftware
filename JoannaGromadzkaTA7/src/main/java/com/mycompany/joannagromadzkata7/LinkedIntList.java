package com.mycompany.joannagromadzkata7;

import java.util.NoSuchElementException;

/**
 *
 * @author szkola
 */
public class LinkedIntList {
    //data field
    private ListNode front; //1st value in the list
    
    //constructor
    public LinkedIntList(){
        front = null; //empty list
    }
     public String toString(){
        if (front == null){
            return"[]";
        } else{
            String result= "["+ front.data;
            ListNode current= front.next;
            while(current!=null){
                result+= ", " +current.data;
                current=current.next;
            }
            result +="]";
            return result;
        }
    }
    public void add(int value){
        if(front==null){
            //add to the empty list
            front= new ListNode(value);
            
        } else {  // adding to the end of an existing list
            ListNode current = front;
            while (current.next!= null){
                current=current.next;
            }
            current.next = new ListNode(value);
        }
    }
    public void add(int index, int value) { 
        if (index == 0) {        // adding to an empty list   
            front = new ListNode(value, front); 
        } else {        // inserting into an existing list      
            ListNode current = front;   
            for (int i = 0; i < index - 1; i++){        
                current = current.next;    
            }     
            current.next = new ListNode(value, current.next);  
        }
    }
    
    
    public int size(){
        //creates varriable which will reflect amount of elements 
        int s = 0;
        if(front == null){
             s = 0;
            
        } else {  
            //adds varriable current, which will iterate over the elements while counting them
            ListNode current = front;
         
           while(current!= null){
                current=current.next;
                s++;
            }
          
        }
        // returns the current number of elements in the list.
        System.out.println(s);
        return s;
    }
    
    //following are 2 methods indexOf:
    public int indexOf(int value){
        int ind = 0;
        ListNode current = front;
        // if list is empty
        if(front == null){
           ind = -1;
         System.out.println("empty"+ ind);
        return ind;
        }
         //go over the list till you get the value
        while (current.data != value){
            //once your current is the last node
            if(current.next == null ){
               ind=-1;
               System.out.println(ind);
              return ind;
            } else
                current=current.next;
              ind++;
        }   
        System.out.println(ind);
        return ind;
    }    
   /*      and here is the 2nd method:
    
    
    public int indexOf(int value){
        int i = 0;
        ListNode current = front;
        for (current.data = 0; current!=null; current= current.next){
            if (current.data==value){
                System.out.println(i);
                return i;
            } else 
               i++;   
        }
       i=-1;
       System.out.println(i);
       return i;
    }       */
    
    
    
    
    public int deleteBack(){
        int l=0;
        ListNode current=front;
        // If the list is empty, throw a NotSuchElementException.
        if(current==null){
            throw new NoSuchElementException();
            
        } while (current!= null){
            current=current.next;
            if (current.next.next==null){
                l = current.next.data;
                System.out.println(l);
                current.next=null;
            return l;
            } 
        }
        //returns the delete value
        return l;
    }
    
    public void removeAll(int value){
        ListNode current= front;
        while(current.next!=null){
            if(current.next.data==value){
                current.next=current.next.next;
            }//case where 1st element needs to be removed 
            else if(current.data==value){ 
               front=front.next;
               current=current.next;
            }//case where last element needs to be removed 
            else if(current.next==null && current.data==value){
                current=null;
            
            }else
                 current=current.next;
        } 
    }
    
    public void doubleList(){
       String d;
       int c =0;
       LinkedIntList alist = new LinkedIntList();
     
       ListNode current=front;
        if(current==null){
           d="[]";
        }
        while(current!= null){
        int a = current.data;
           alist.add(a);
           alist.add(c,a); 
           c++;
           current=current.next;   
        }
      
        front=alist.front;
        System.out.println(alist);
       }
        
}
