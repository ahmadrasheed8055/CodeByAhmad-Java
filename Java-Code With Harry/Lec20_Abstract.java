//Abstract method are the methods that are declared but not implemented (Empty, without Brackets, etc...)
//Abstract class is a class that contain abstract methods - simple class can't contain abstract methods
abstract class Parent {
    public Parent() {
        System.out.println("Parent called...");
    }

    abstract public void fun();
}

class Child extends Parent{
    public Child(){
        System.out.println("Child called...");
    }
    @Override
    public void fun(){
        System.out.println("Function one implemented in Child!");
    }
}

public class Lec20_Abstract {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.fun();


        Parent obj2 =  new Child();
        obj2.fun();

    }
}
