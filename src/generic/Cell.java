package generic;

import interfaces.Movable;
import parent.Animal;

import java.util.List;

public class Cell <Flyable> extends Habitat <Movable> {
    private int cellSize;
    private List<Animal> cellAnimal;

    public Cell (int cellSize, List<Animal> cellAnimal) {
        this.cellSize = cellSize;
        this.cellAnimal = cellAnimal;
    }

    public int getCellSize() {
        return cellSize;
    }

    public List<Animal> getCellAnimal() {
        return cellAnimal;
    }

    public void AddToCell (Animal animal) {
        if (cellSize > 0 && animal instanceof interfaces.Swimable) {
            cellSize = cellSize - animal.getComfortableSpace();
            cellAnimal.add(animal);
            System.out.println("Animal was successfully added");
        }
        else {
            System.out.println("Cell is full or animal can't live in it");
        }
    }

}
