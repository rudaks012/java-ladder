package step2;

import step2.domain.GameParticipants;
import step2.domain.Ladder;
import step2.ui.InputView;
import step2.ui.ResultView;

public class LadderGameApplication {

    public static void main(String[] args) {
        GameParticipants gameParticipants = new GameParticipants(InputView.names());
        int height = InputView.maxLadderHeight();

        Ladder ladder = new Ladder(gameParticipants.getNames(), height);

        ResultView.printResultMessage();
        ResultView.printResult(gameParticipants.getParticipants(), ladder);
    }
}
