
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


/**
 * @author Joanna Gromadzka
 * AD 300 - 5204
 * Assignment 2
 * Guess the capitals using maps
 * Store the pairs of states and capitals in a 2 dimensional array; Retrieve pairs of each state and its capital from the 2 dimensional array, and store pairs of each state and its capital in a HashMap. (use a for loop in here)
When you store pairs of each state and its capital in a HashMap, make sure you convert the key value (state) into the same case, either all upper cases or all lower cases
You program should prompt the user 5 time for state’s input, and each time should display the capital of that state using the HashMap
When you are reading user input state, make sure you convert it to the case that you stored in the HashMap, and trim all those spaces
Use the containsKey method to check if the HashMap contains the key, and then use the get methods to retrieve the corresponding capital
When user enter a non valid state, print out “No such state”

 */
public class GuessCapitals {
    public static void main(String[] args) {
        
        //Store the pairs of states and capitals in a 2 dimensional array
        String[][] table =  {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"},
        };
        //Retrieve pairs of each state and its capital from the 2 dimensional array, 
        //and store pairs of each state and its capital in a HashMap. (use a for loop in here)
        //create new object hashMap 
        Map<String,String> pary = new HashMap<String,String>();
       
        //loop over 2dm array to retrieve pairs
        for(int row = 0; row<table.length;row++) {
            for(int column = 0; column<table[row].length; column++){
               System.out.println((table[row][column]).toUpperCase()+ " ");
               
               //store the pairs in earlier created hashMap, 
               //convert the key value (state) into the same case
               pary.put((table[row][0]).toUpperCase(),table[row][column]); 
              
            }    
            System.out.println();
           
        } 
       //System.out.println("pary"+ pary);
       //prompt the user 5 time for state’s input, and each time should display the capital of that state using the HashMap
        Scanner console= new Scanner(System.in); 
            int number= 0;
            do{  
                System.out.println("Enter a state name: ");
                String name = (console.next()).toUpperCase();
                number++;
                    //search the map for given name using containsKey method and retrieve corresponding capital using get
                if(pary.containsKey(name)){
                    String capital = pary.get(name);
                    System.out.println("The capital is " + capital);
                } else System.out.println("No such state");
                
            } while (number < 5);
       
    }
}