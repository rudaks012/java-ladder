package step2.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    public static final int LADDER_LIMIT = 1;
    private final List<Line> lines = new ArrayList<>();

    public Ladder(int width, int height) {
        validationWidthAndHeight(width, height);
        for (int i = 0; i < height; i++) {
            lines.add(Line.of(width));
        }
    }

    private static void validationWidthAndHeight(int width, int height) {
        if (width < LADDER_LIMIT && height < LADDER_LIMIT) {
            throw new IllegalArgumentException("높이와 넓이는 1 이상이어야 한다.");
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}
