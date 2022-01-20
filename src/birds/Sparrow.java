package birds;

import interfaces.Flyable;
import parent.Bird;

public class Sparrow extends Bird implements Flyable {

    @Override
    public int getComfortableSpace() {
        return 1;
    }
}
