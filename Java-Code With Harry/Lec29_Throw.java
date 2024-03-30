import java.util.Scanner;

class MyE extends Exception {


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return "Less then 9 not allowed";
    }
}

class maxAge extends Exception{

    @Override
    public String getMessage() {
       return ("Make sure your age is under 18");
    }

    @Override
    public String toString() {
        return "Age is less than 18";
    }
}

public class Lec29_Throw {
    public static void main(String[] args) throws MyE {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = sc.nextInt();
        if (n < 10) {
            try {

                throw new MyE();

            }catch (MyE e){

                System.out.println(e.toString()); ;
//                e.printStackTrace();
//                System.out.println(e.getCause());
            }
        } else if (n > 20) {
            throw new ArithmeticException(" grater than 20 No allowed");
        }


        int age = 7;
        if (age < 18){
            try{
                throw new maxAge();
            }catch (maxAge e){
                System.out.println(e.toString());
            }
        }
    }

}
