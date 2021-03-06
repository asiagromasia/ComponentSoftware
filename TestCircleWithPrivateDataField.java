/* public - The class, data, or method is visible to any class in any package
   private - The data or methods can be accessed only by the declaring class
   - by default, the class, variable, or method can be accessed by any class in the same package 
   WHY: to protect and for easier maintainance */


public class TestCircleWithPrivateDataField {
    
    public static void main(String[] args) {
        
        // Create a Circle with radius 5.0
        Circle myCircle = new Circle (5.0);    
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1); 
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea()); 
    }
}
