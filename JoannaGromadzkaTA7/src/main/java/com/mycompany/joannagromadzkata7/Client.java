package com.mycompany.joannagromadzkata7;

/**
 * @author Joanna Gromadzka
 * AD 300 - 5204
 * Assignment 7
 * Linked List class and writing its methods 
 */
public class Client {
    
    public static void main(String[] args) {
        LinkedIntList list= new LinkedIntList();
      
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(20);
        System.out.println("list = " + list);
        System.out.print("list.size() is: ");
        list.size();
        System.out.print("list.indexOf(2) is: ");
        list.indexOf(2);
        list.deleteBack();
        System.out.println("After list.deleteBack()");
        System.out.println("list = " + list);
        list.removeAll(18);
        System.out.println("After list.removeAll(18)");
        System.out.println("list = " + list);
        list.doubleList();
        System.out.println("After list.doubleList()");
        System.out.println("list = " + list);
        
        
    }
    
}
