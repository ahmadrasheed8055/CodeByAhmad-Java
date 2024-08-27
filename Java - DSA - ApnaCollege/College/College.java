package College;

public class College {
    String name;
    int age;
     String section;

     public void show(String name, int age, String section){
         this.name = name;
         this.age = age;
         this.section = section;

         System.out.println(name  + " " +  age + " " + section);
     }
}
