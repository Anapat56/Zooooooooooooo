package Lib;

public class Bird extends Animal{
     public Bird(String name) {
        super(name);
    }
    @Override
    public String MakeSound() {
        return "Bird chirp";
    }
    
}
