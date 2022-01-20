package animal;

import interfaces.Walkable;
import parent.Animal;

public class Fox extends Animal implements Walkable {

    public Fox () {
    }

    @Override
    public int getComfortableSpace() {
        return 10;
    }
}
