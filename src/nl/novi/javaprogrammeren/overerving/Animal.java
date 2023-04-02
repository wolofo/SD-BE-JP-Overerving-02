package nl.novi.javaprogrammeren.overerving;

public class Animal {
    private String name;
    private char gender;
    private String food;


    public Animal (String name, char gender, String food){
        this.name =name;
        this.gender = gender;
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }



    public void movement (){
        System.out.println(name + " has moved 0,25m");

    }
    public void sound () {
        System.out.println(name + " has made a sound");
    }
    public void sleep () {
        System.out.println(name + " has slept 8 hours");
    }
    public void eat (){
        System.out.println(name + " has eaten " + food);
    }

}
