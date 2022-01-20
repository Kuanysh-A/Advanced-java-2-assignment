package fishes;

import interfaces.Swimable;
import parent.Fish;

public class Shark extends Fish implements Swimable {

    @Override
    public int getComfortableSpace() {
        return 25;
    }
}
