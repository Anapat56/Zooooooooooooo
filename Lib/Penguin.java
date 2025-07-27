package Lib;

public class Penguin extends Mammal implements Swimable{

    public Penguin(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String MakeSound() {
       return "Squawk!";
    }

    @Override
    public String Swim() {
        return "The penguin dives gracefully in the water.";
    }
    
}
