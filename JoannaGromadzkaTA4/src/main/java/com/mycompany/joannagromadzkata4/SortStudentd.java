/*
 * Write a program that prompts the user to enter the number of students, the students’ names, 
and their scores and prints student names in decreasing order of their scores.  
Assume the name is a string without spaces, use the Scanner’s next() method to read a name.
Store students’ names in one array and store scores in another array (use parallel arrays)
Please do NOT use Arrays.sort or Collections.sort
 */
package com.mycompany.joannagromadzkata4;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Joanna Gromadzka
 * AD 300 - 5204
 * Assignment 4
 * store and sort students
 */
public class SortStudentd {
    public static void main(String[] args) {
        int i;
        int student=0;
        //create scanner to read input
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        //reads input and assigns it 
        int nr = input.nextInt();
        //creates 2 arrays for names and scores
        String[]names = new String[nr];
        Double[]scores = new Double[nr];
         
        //creates while loop to limit amount of student's input
        while (student!= nr){
           
            for ( i=0; i<names.length; i++){
               
                System.out.print("Enter a student name: ");
                names[i] = input.next();
                    
                System.out.print("Enter a student score: ");
                Double score = input.nextDouble();
                scores[i]= score;
                student++;  
            } 
            //created TreeSet to use its benefits
            TreeSet<Double> treeSet = new TreeSet<>(Arrays.asList(scores));
            int l = treeSet.size();
            System.out.println("Names in decreasing order of their scores are: ");
            //using recursive method to print and get read off last element of treeSet
            sorting(treeSet,l,i,names,scores);
            
        } 
    
    }    
    
    public static void sorting(TreeSet<Double>treeSet,int l,int i,String[]names,Double[]scores){
        int j=1;
        l = treeSet.size();
        
        if(l==0){
           System.out.println();
        } else if (l > 0){
            for (double t : treeSet){                           
                scores[i-1]=t;                           
            } 
            System.out.println(" " + names[i-1]+ " "+ scores[i-1]);
            treeSet.remove(treeSet.last());
            sorting(treeSet,l-1,i-1,names,scores);
        } else System.out.println();
        
    }
}
        
        
    
    

