import java.util.ArrayList;
import Lib.*;

public class Zoo {
public static void main(String[] args) {
    ArrayList<Animal> Zoo = new ArrayList<>();
    Zoo.add(new Dolphin("Jamal"));
    Zoo.add(new Eagle("Muhammad"));
    Zoo.add(new Lion("Tonkaw"));
    Zoo.add(new Penguin(""));

    for (Animal animal : Zoo) {
        System.err.println(animal.getName()+" Sound : "+animal.MakeSound());
    }

    for (Animal animal : Zoo) {
        if (animal instanceof Flyable) {
           System.out.println(animal.getName()+" Can Fly "+animal.MakeSound());
        }
        else if (animal instanceof Swimable) {
            System.out.println(animal.getName()+" Can Swim "+animal.MakeSound());
        }
        else{
            System.out.println(animal.getName()+" walk in Zoo ");
        }
    }
 }
}
