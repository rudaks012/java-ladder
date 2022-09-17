package step2.ui;

import step2.domain.Ladder;
import step2.domain.Line;
import step2.domain.Name;
import step2.domain.Point;

import java.util.List;

public class ResultView {

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printResult(List<Name> participants, Ladder ladder) {
        for (Name participant : participants) {
            printParticipant(participant);
        }

        System.out.println();

        List<Line> lines = ladder.getLines();
        lines.forEach(point -> printLine(point.getPoints()));
    }

    private static void printParticipant(Name participant) {
        String name = "       " + participant.getName();
        name = name.substring(name.length() - 6);
        System.out.print(name);
    }

    private static void printLine(List<Point> points) {
        System.out.print("     ");
        points.forEach(ResultView::printSpecialSymbol);
        System.out.println("|");
    }

    private static void printSpecialSymbol(Point point) {
        if (point.isExist()) {
            System.out.print("|-----");
            return;
        }

        System.out.print("|     ");
    }
}
