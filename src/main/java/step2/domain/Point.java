package step2.domain;

import java.util.Random;

public class Point {
    public static final boolean RANDOM_BOOLEAN = new Random().nextBoolean();

    private final boolean exits;

    public Point() {
        this(RANDOM_BOOLEAN);
    }

    public Point(boolean exits) {
        this.exits = exits;
    }

    public Point nextPoint() {
        if (isExist()) {
            return new Point(false);
        }
        return new Point();
    }

    public boolean isExist() {
        return exits;
    }
}
