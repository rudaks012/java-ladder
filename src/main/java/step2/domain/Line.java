package step2.domain;

public class Line {
    public static final Line ZERO = new Line(0);
    private final int value;


    public Line(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("사다리의 수는 음수가 될수 없다.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
