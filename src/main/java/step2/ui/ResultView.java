package step2.ui;

import step2.domain.Ladder;
import step2.domain.Line;
import step2.domain.Point;

import java.util.List;

public class ResultView {

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printResult(List<String> participants, Ladder ladder) {
        participants.forEach(ResultView::printParticipant);

        System.out.println();

        List<Line> lines = ladder.getLines();
        lines.forEach(point -> printLine(point.getPoints()));
    }

    private static void printLine(List<Point> points) {
        System.out.print("     ");
        points.forEach(point -> {
            if (point.isExist()) {
                System.out.print("|-----");
                return;
            }

            System.out.print("|     ");
        });
        System.out.println("|");
    }

    private static void printParticipant(String point) {
        point = "       " + point;
        point = point.substring(point.length() - 6);
        System.out.print(point);
    }
}
