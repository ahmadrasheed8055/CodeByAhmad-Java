// In Java, an interface is similar to a class, but it contains only abstract methods.
// This means that all methods declared in an interface are abstract, lacking implementation.
// When we want to use the functionality defined in an interface, we use the keyword "implements"
// instead of "extends" used with classes.
// Unlike classes, where the rule of multiple inheritance cannot be applied,
// with interfaces, a class can implement multiple interfaces.
// This allows for achieving a form of multiple inheritance in Java without the complexities
// associated with class inheritance.

interface Car {
    // We can create properties, but we cannot modify them later.
    int speed = 100;

    void currentSpeed();

    void increaseSpeed();

    void decreaseSpeed();

    //if we want to implement the method in interface without breaking other classes
    // we can use default method
    default void stopCar(){
        System.out.println("Stopping the car...");
    }
    default void fun(){

    };

}

interface Body {
    String color = "Red";
    String company = "Toyota";

}

 class MyCar implements Car, Body {
    @Override
    public void currentSpeed() {
        System.out.println(speed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Increasing..." + (speed+1));
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Decreasing..." + (speed-1));
    }
    public void details(){
        System.out.println("Color : "+color + "\nCompany : " + company );
        // we can't modify interface properties
    }
}

public class Lec21_Interface {
    public static void main(String[] args) {
        MyCar ahmad = new MyCar();
        ahmad.currentSpeed();
        ahmad.increaseSpeed();
        ahmad.decreaseSpeed();
        ahmad.stopCar();
        ahmad.details();
    }
}
