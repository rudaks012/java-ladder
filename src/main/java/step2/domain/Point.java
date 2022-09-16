package step2.domain;

import java.util.Random;

public class Point {
    private final boolean exits;

    public Point() {
        this(new Random().nextBoolean());
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

    private boolean isExist() {
        return exits;
    }
}
