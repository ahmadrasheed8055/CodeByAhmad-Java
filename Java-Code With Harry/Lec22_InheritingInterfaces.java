
interface ParentInterface{
    void hello();
    void hello(String name);
}

interface Child1{
    void welcome();
    void welcome(String name);
}
//you can multiple inherit in interfaces
interface Child2 extends ParentInterface, Child1{

}

class Greeting implements Child2{
    @Override
    public void hello(){
        System.out.println("Hello");
    }
    public  void hello(String name){
        System.out.println("Hello " + name);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome");
    }

    @Override
    public void welcome(String name){
        System.out.println("Welcome " + name);
    }
}

public class Lec22_InheritingInterfaces {
    public static void main(String[] args) {
        Greeting obj = new Greeting();
        obj.hello();
        obj.hello("Ahmad");
        obj.welcome();
        obj.welcome("Ahmad");
    }
}
