package generic;

import interfaces.Movable;
import parent.Animal;

import java.util.List;

public class Aquarium <Swimable> extends Habitat <Movable>{
    private int aquariumSize = 0;
    private List<Animal> aquariumAnimal;

    public Aquarium (int aquariumSize, List<Animal> aquariumAnimal) {
        this.aquariumSize = aquariumSize;
        this.aquariumAnimal = aquariumAnimal;
    }

    public int getAquariumSize() {
        return aquariumSize;
    }

    public List<Animal> getAquariumAnimal() {
        return aquariumAnimal;
    }

    public void AddToAquarium (Animal animal) {
        if (aquariumSize > 0 && animal instanceof interfaces.Swimable) {
            aquariumSize = aquariumSize - animal.getComfortableSpace();
            aquariumAnimal.add(animal);
            System.out.println("Animal was successfully added");
        }
        else {
            System.out.println("Aquarium is full or animal can't live in it");
        }
    }

}
