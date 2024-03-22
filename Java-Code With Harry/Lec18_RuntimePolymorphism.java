
class A1{
    public void function(){
        System.out.println("Function A called...");
    }
    public void me(){
        System.out.println("Ahmad");
    }
}

class B1 extends A1{
    @Override
    public void function(){
        System.out.println("Function B called...");
    }
}

public class Lec18_RuntimePolymorphism {
    public static void main(String[] args) {
        //creating object of Class b with the reference of class A
        //it means when we call a function by reference
        // like this we are creating a object by reference  of another object
        A1 obj;
        // int a, A1 class is working like datatype, this is class type variable obj
        obj = new B1();
        obj.function();
        obj.me();
    }

}
