package step2;

import step2.domain.Ladder;
import step2.ui.InputView;
import step2.ui.ResultView;

import java.util.List;

public class LadderGameApplication {

    public static void main(String[] args) {
        List<String> participants = List.of(InputView.names());
        int height = InputView.maxLadderHeight();

        Ladder ladder = new Ladder(participants.size() -1, height);

        ResultView.printResult(participants, ladder);
    }
}
