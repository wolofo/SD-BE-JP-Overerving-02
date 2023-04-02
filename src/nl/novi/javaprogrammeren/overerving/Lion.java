package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {
    private String nameCage;
    private String lastFed;
    private String countryOfOrigin;
    private int amountOfChildren;
    public Lion(String name, char gender, String food, String nameCage, String lastFed, String countryOfOrigin, int amountOfChildren) {
        super(name, gender, food);
        this.nameCage = nameCage;
        this.lastFed = lastFed;
        this.countryOfOrigin = countryOfOrigin;
        this.amountOfChildren = amountOfChildren;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }
    public void setNameCage(String nameCage) {
        this.nameCage = nameCage;
    }

    public String getNameCage() {
        return nameCage;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    @Override
    public void movement() {
        super.movement();
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void printLion(){
        System.out.println("name lion: " + getName());
        System.out.println("gender: " + getGender());
        System.out.println("favorite food " + getFood());
        System.out.println("name of Cage: " + getNameCage());
        System.out.println("when last fed: " + getLastFed());
        System.out.println("country of origin: " + getCountryOfOrigin());
    }
}
