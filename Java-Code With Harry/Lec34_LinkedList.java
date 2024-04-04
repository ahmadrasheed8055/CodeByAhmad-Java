import java.util.LinkedList;

public class Lec34_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
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

        LinkedList<String> li2 = new LinkedList<>();
        li2.add("12");
        li2.add("4");
        li2.add("1");
        li2.add("32");

        li.addAll(0,li2);

        System.out.println("\nPrinting names: ");
        for ( String n : li){
            System.out.print(n + " ");
        }

        li.removeAll(li2);
        li.set(4, "Farooq");

        li.addLast("Hasnain");
        li.addFirst("Khurram");

        System.out.println("\nPrinting names: ");
        for ( String n : li){
            System.out.print(n + " ");
        }
    }
}
