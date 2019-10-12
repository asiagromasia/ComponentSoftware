/* ArrayList - a collection storing an ordered sequence of elements,
             - each element is accessible by a 0-based index
             - a list has a size (number of elements that have been added)
             - elements can be added to the front, back, or elsewhere    */

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        
        //create an arrayList to store cities
        ArrayList<String> cityList= new ArrayList<>();
        
        //add some cities
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        
        //display the arrayList size
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? "+ cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " +cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());
        
        //insert a new city at index 2
        cityList.add(2,"Xian");
        
        //remove a city
        cityList.remove("Miami");
        
         //remove a city at index 1
        cityList.remove(1);
        
        //display the content of the list
        System.out.println(cityList.toString());
        
        for (int i=cityList.size()-1; i>0; i--){
            System.out.println(cityList.get(i) + " ");
        }
        System.out.println();   
        
        //create another list to store  circle object
        ArrayList<Circle> list =new ArrayList<>();
        
        //add 2 circles into the arraylist
        list.add(new Circle(2));
        list.add(new Circle(3));
        
        ////display the area of the circles
        System.out.println("The area of the 1st circle " + list.get(0).getArea());
        System.out.println("The area of the 2nd circle " + list.get(1).getArea());
        
        
    }
        
}
