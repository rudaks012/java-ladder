package step2.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Line {

    public static final int START_INCLUSIVE = 1;
    public static final int POINT_NUMBER = 1;

    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public static Line of(int width) {
        List<Point> points = new ArrayList<>();

        points.add(new Point());
        IntStream.range(START_INCLUSIVE, width)
                .forEachOrdered(widthPoint -> points.add(points.get(widthPoint - POINT_NUMBER).nextPoint()));

        return new Line(points);
    }

    public List<Point> getPoints() {
        return points;
    }
}
