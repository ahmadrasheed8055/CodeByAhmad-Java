interface ParentInterface1 {
    void hello();

    void hello(String name);
}


//you can multiple inherit in interfaces
interface Child3 {
    void welcome();
}

class Greeting1 implements ParentInterface, Child3 {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    public void hello(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome");
    }

    public void sample() {
        System.out.println("This is sample function");
    }

}


public class Lec23_Polymorphism {
    public static void main(String[] args) {
        Greeting o1 = new Greeting();
        ParentInterface o2 = new Greeting();
        o1.hello("Ahmad");
//        o2.welcome();
//        o2.sample(); --> these two throw error because they can't access other functions,
//        even own methods

    }
}

/*
Class reference:
 Jab aap kisi class ka reference lete hain aur uske agay kisi aur
  class ka object banate hain, to new object ke methods run honge
  jo uss class mein define kiye gaye hain.


Interface reference:
jab aap kisi ek interface ka reference lete hain aur uske
agay kisi class ka object banate hain, to aap sirf us interface mein
declare kiye gaye methods ko hi access kar sakte hain.
 */
