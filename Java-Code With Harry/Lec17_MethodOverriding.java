
class c{
    public void fun(){
        System.out.println("This is function of c");
    }
    public void fun1(){
        System.out.println("This is fun 1 of c");
    }

    public void me(){
        System.out.println("C is here...");
    }
}

class b extends  c{
    @Override
    public void fun(){
        super.fun1();
        System.out.println("This is function of b ");
    }
}

class D extends c{
    public void me(){
        System.out.println("D is here...");
    }
}
public class Lec17_MethodOverriding {
    public static void main(String[] args) {
        b b = new b();
        b.fun();

        c C = new D(); // Dynamic Method dispatch - Runtime Polymorphism
        C.me();


    }
}
