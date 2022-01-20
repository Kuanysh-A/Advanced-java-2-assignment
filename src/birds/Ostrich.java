package birds;

import interfaces.Flyable;
import parent.Bird;

public class Ostrich extends Bird implements Flyable {

    @Override
    public int getComfortableSpace() {
        return 28;
    }
}
