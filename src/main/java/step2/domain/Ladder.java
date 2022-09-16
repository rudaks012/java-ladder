package step2.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private Name name;

    private Line line;

    public Ladder(final String name) {
        this(name, Line.ZERO);
    }

    public Ladder(final String name, final Line line) {
        this.name = new Name(name);
        this.line = line;
    }
}
