
//Collection classes and interfaces are present in java.util pkg
import java.util.ArrayList;

public class Lec33_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("Ahmad");
        li.add("Rasheed");
        li.add("Umar");
        li.add("Asif");
        li.add("Usman");
        //you can also insert at any specific index
        li.add(0, "Furkan");

        //for getting output from array or accessing elements using get method
        //li.get()
        //You can also use for-each loop
        System.out.println("Printing names: ");
        for ( String n : li){
            System.out.print(n + " ");
        }

        ArrayList<String> li2 = new ArrayList<>();
        li2.add("12");
        li2.add("4");
        li2.add("1");
        li2.add("32");

        li.addAll(0,li2);

        System.out.println("Printing names: ");
        for ( String n : li){
            System.out.print(n + " ");
        }

        li.removeAll(li2);
        li.set(4, "Farooq");

        System.out.println("Printing names: ");
        for ( String n : li){
            System.out.print(n + " ");
        }



    }
}
