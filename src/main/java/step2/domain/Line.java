package step2.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private List<Point> points ;

    public Line(List<Point> points) {
        this.points = points;
    }

    public static Line of(int width) {
        List<Point> points = new ArrayList<>();

        points.add(new Point());
        for (int i = 1; i < width; i++) {
            points.add(points.get(i - 1).nextPoint());
        }

        return new Line(points);
    }

    public List<Point> getPoints() {
        return points;
    }
}
