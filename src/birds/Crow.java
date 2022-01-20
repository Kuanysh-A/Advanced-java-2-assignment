package birds;

import interfaces.Flyable;
import parent.Bird;

public class Crow extends Bird implements Flyable {

    @Override
    public int getComfortableSpace() {
        return 4;
    }
}
