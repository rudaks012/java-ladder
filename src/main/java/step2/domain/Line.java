package step2.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private List<Point> points = new ArrayList<>();

    public Line(List<Point> points) {
        this.points = points;
    }

    public static Line of(int width) {
        List<Point> points = new ArrayList<>();

        points.add(new Point());

        return new Line(points);
    }
}
