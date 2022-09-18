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
            throw new LadderException(width, height);
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}
