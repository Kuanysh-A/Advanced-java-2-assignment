package animal;

import interfaces.Walkable;
import parent.Animal;

public class Tiger extends Animal implements Walkable {

    @Override
    public int getComfortableSpace() {
        return 25;
    }
}
