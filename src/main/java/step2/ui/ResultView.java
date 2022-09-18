package step2.ui;

import step2.domain.Ladder;
import step2.domain.Line;
import step2.domain.Name;
import step2.domain.Point;

import java.util.List;

public class ResultView {

    public static final int PARTICIPANT_MATCH_LADDER_SIZE = 6;
    public static final String EXECUTION_RESULT = "실행 결과";

    public static void printResultMessage() {
        println(EXECUTION_RESULT);
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
        name = name.substring(name.length() - PARTICIPANT_MATCH_LADDER_SIZE);
        println(name);
    }

    private static void printLine(List<Point> points) {
        println("     ");
        points.forEach(ResultView::printSpecialSymbol);
        println("|");
    }

    private static void printSpecialSymbol(Point point) {
        if (point.isExist()) {
            println("|-----");
            return;
        }

        println("|     ");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
