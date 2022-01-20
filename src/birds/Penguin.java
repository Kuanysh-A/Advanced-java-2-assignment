package birds;

import interfaces.Flyable;
import parent.Bird;

public class Penguin extends Bird implements Flyable {

    @Override
    public int getComfortableSpace() {
        return 7;
    }
}
