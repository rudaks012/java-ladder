package step2.domain;

public class Ladder {

    private final Name name;

    private Line line;

    public Ladder(final String name) {
        this(name, Line.ZERO);
    }

    public Ladder(final String name, final Line line) {
        this.name = new Name(name);
        this.line = line;
    }

    public String name() {
        return name.getName();
    }

    public int line() {
        return line.getValue();
    }
}
