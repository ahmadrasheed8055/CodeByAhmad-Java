public class Lec11_VarArgs {

    static void names(String name, String ...names){
        //name is compulsory parameter
        //other given will store as array in names parameter
        System.out.print(name + " ");

        for (String s : names){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Call 1: " );
        names("Ahmad");
        System.out.println("Call 2:");

        String [] n = {"Ayoub", "Ismat", "Hussain"};
        names("Arif", n);
        System.out.println("Call 3:");
        names("Ahmad", "Umar","Farooq");


    }

}
