package com.mycompany.joannagromadzkata7;

/**
 *
 * @author szkola
 */
public class ListNode {
     //data fields
    int data;  //store data in node
    ListNode next; //store the ref
    //constructors
    public ListNode(){
        this(0,null);
    }
    public ListNode(int data){
        this(data,null);
    }
    public ListNode(int data, ListNode next){
        this.data=data;
        this.next=next;
    }
    
}
