package generic;

import interfaces.Movable;
import parent.Animal;

import java.util.List;

public class Cage <Walkable> extends Habitat <Movable>{
    private int cageSize;
    private List<Animal> cageAnimal;

    public Cage(int cageSize, List<Animal> cageAnimal) {
        this.cageSize = cageSize;
        this.cageAnimal = cageAnimal;
    }

    public int getCageSize() {
        return cageSize;
    }

    public List<Animal> getCageAnimal() {
        return cageAnimal;
    }

    public void AddToCage (Animal animal) {
        if (cageSize > 0 && animal instanceof interfaces.Walkable) {
            cageSize = cageSize - animal.getComfortableSpace();
            cageAnimal.add(animal);
            System.out.println("Animal was successfully added");
        }
        else {
            System.out.println("Cage is full or animal can't live in it");
        }
    }

}
