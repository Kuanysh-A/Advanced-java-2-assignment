package fishes;

import interfaces.Swimable;
import parent.Fish;

public class Pike extends Fish implements Swimable {

    @Override
    public int getComfortableSpace() {
        return 5;
    }
}
