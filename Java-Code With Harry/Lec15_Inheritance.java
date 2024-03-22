// Base class representing a person
class Person1 {
    // Attributes common to all persons
    public int age;
    public String name;
    public String gender;

    // Getters and setters for the attributes
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

// Subclass representing a woman, inherits from Person1 class
class Women extends Person1 {
    // Additional attributes specific to women
    String isPregnant;
    String hairColor;

    // Getters and setters for additional attributes
    public String getIsPregnant() {
        return isPregnant;
    }

    public void setIsPregnant(String isPregnant) {
        this.isPregnant = isPregnant;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    // Method to print details of a woman
    public void getDetails() {
        System.out.println("Details of Women Class : ");
        System.out.println("Name :" + getName());
        System.out.println("Age :" + getAge());
        System.out.println("Hair Color :" + getHairColor());
        System.out.println("Pregnant : " + getIsPregnant());
    }
}

// Subclass representing a man, inherits from Person1 class
class Men extends Person1 {
    // Additional attributes specific to men
    private int beardLength;
    private boolean isBald;
    private String hobbies;

    // Getters and setters for additional attributes
    public int getBeardLength() {
        return beardLength;
    }

    public void setBeardLength(int beardLength) {
        this.beardLength = beardLength;
    }

    public boolean isBald() {
        return isBald;
    }

    public void setBald(boolean bald) {
        isBald = bald;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    // Method to print details of a man
    public void getDetails() {
        System.out.println("Details of Men : ");
        System.out.println("Name :" + getName());
        System.out.println("Age :" + getAge());
        System.out.println("Hobbies :" + getHobbies());
        System.out.println("Beard Length :" + getBeardLength());
        System.out.println("Bald : " + (isBald() ? "Bald" : "Not Bald"));
    }
}

public class Lec15_Inheritance {

    public static void main(String[] args) {
        // Creating an object of the Men class and setting its attributes
        Men ahmad = new Men();
        ahmad.setBald(false);
        ahmad.setHobbies("Cricket");
        ahmad.setAge(18);
        ahmad.setBeardLength(3);
        ahmad.setName("Ahmad Rasheed");

        // Calling the getDetails method to print the details of the man
        ahmad.getDetails();


        Women zamda = new Women();
        zamda.setAge(25);
        zamda.setName("Zamda Khan");
        zamda.setHairColor("Brown");
        zamda.setIsPregnant("No");

        // Calling the getDetails method to print the details of the woman
        zamda.getDetails();


    }
}
