public class Lec10_MethodOverloading {
    int n;
    static void change1(int n) {
        n = 100;
    }

    static void change2(int[] n) {
        n[0] = 100;
    }
    static  void  change3(Lec10_MethodOverloading obj){
        obj.n = 100;
    }
    static void hello(){
        System.out.println("Hello!");
    }
    static void hello(String name){
        System.out.println("Hello!" + name);
    }
    static void hello(String name, int age){ // the variables i've passed in this function called parameters
        System.out.println("Hello!"+name+". I thing your age is "+age);
    }



    public static void main(String[] args) {
        //pass by value change
        int n1 = 20;
        System.out.println("Orignal: " + n1);
        change1(n1);
        System.out.println("After change : " + n1);

        //pas by obj change (By passing obj means to pass by reference)
        Lec10_MethodOverloading obj = new Lec10_MethodOverloading();
        obj.n = 10;
        change3(obj);
        System.out.println("Object value after change : " + obj.n);

        //pas by arr, arr is also an object for their values
        int[] n2 = {12};
        System.out.println("Orignal: " + n2[0]);
        change2(n2);
        System.out.println("After change : " + n2[0]);

        //Method overloading
        hello();
        hello("Ahmad"); // the value i've passed in this function called arguments
        hello("Ahmad",18);

        //Method overloading can't be perform by changing return type
    }
}
