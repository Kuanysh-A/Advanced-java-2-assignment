package animal;

import interfaces.Walkable;
import parent.Animal;

public class Turtle extends Animal implements Walkable {

    @Override
    public int getComfortableSpace() {
        return 10;
    }
}
