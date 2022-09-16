package step2.domain;

public class Line {
    public static final Line ZERO = new Line(0);
    private final int value;


    public Line(int value) {
        this.value = value;
    }
}
