package step2.ui;

import step2.domain.Ladder;

import java.util.List;

public class ResultView {

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printResult(List<String> participants, Ladder ladder) {
        participants.forEach(ResultView::printParticipant);
    }

    private static void printParticipant(String point) {
        point = "       " + point;
        point = point.substring(point.length() - 6);
        System.out.print(point);
    }
}
