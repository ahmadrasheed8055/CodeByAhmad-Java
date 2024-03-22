
class p{
    public p(){
        super();
        System.out.println("Im first constructor!");
    }
    public  p(int n){
        System.out.println("Im overloaded first constructor!" + n);
    }
    public p(String name){
        System.out.println("Rasheed");
    }

}

class c1 extends p{
    public c1() {
        super("Rasheed");
        System.out.println("Im c1 constructor!");
    }
    public c1(int n){
        super(2);
        System.out.println("Im c1 overloaded constructor!" + n);
    }
}

class c2 extends c1{
    public c2() {
        System.out.println("Im c2 constructor!");
    }
    public  c2(int n){
        super(3); // to run the parameterized constructor of parent class
        System.out.println("Im c2 overloaded constructor!" + n);
    }

    public c2(String name){
        System.out.println("Im named  constructor!" + name);
    }
}

public class Lec16_Constructor_Inheritance {

    public static void main(String[] args) {

        c2 obj = new c2("ahmad");

    }
}
