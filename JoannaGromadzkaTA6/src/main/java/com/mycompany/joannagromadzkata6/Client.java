/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joannagromadzkata6;
import java.util.*;
/**
 *
 * @author szkola
 */
public class Client {
    public static void main(String[] args) {
         //construct  a list
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);
        
        // display the result 
        System.out.println("list= "+ list);
        System.out.println(list.lastIndexOf(4));
        list.count(5);
        list.removeLast();
        System.out.println("list after removing last = "+ list);
        list.doubleList();
    }
    
}
