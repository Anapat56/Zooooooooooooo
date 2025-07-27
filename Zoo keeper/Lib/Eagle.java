package Lib;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String MakeSound() {
        return "Screech!";
    }

    @Override
    public String Fly() {
        return "The eagle soars through the sky.";
    }

    
}