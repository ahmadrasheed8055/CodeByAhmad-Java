class Person {

    private String name;
    private int id;
    private int age;

    //Constructor
    public Person(){
        this.name = "\0";
        this.age = 0;
        this.id = 0;
    }

    public Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }


    //Setters
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public void setAge(int a){
        this.age = a;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public void printDetail() {
        System.out.println("Name : " + getName());
        System.out.println("Id : " + getId());
        System.out.println("Age : " + getAge());
    }


}

public class Lec13_CustomClass {
    public static void main(String[] args) {
        Person ahmad = new Person();
        Person ismat = new Person();
        Person ayoub = new Person("Ayoub Khan", 20,22);

        ismat.printDetail();

        ahmad.setName("Ahmad Rasheed");
        ahmad.setId(11);
        ahmad.setAge(18);

        System.out.println("Name : " + ahmad.getName());
        System.out.println("Id : " + ahmad.getId());
        System.out.println("Age : " + ahmad.getAge());
        ahmad.printDetail();

        ayoub.printDetail();



    }
}
