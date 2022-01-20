package animal;

import interfaces.Walkable;
import parent.Animal;

public class Wolf extends Animal implements Walkable {

    @Override
    public int getComfortableSpace() {
        return 15;
    }
}
