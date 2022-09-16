package step2.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private List<Line> lines = new ArrayList<>();

    public Ladder(int width, int height) {
        if (width < 1 && height < 1) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < height; i++) {
            lines.add(Line.of(width));
        }
    }
}
