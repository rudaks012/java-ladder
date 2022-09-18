package step2;

import step2.domain.GameParticipants;
import step2.domain.Ladder;
import step2.ui.InputView;
import step2.ui.ResultView;

public class LadderGameApplication {

    public static void main(String[] args) {
        GameParticipants gameParticipants = new GameParticipants(InputView.enterNames());
        int height = InputView.enterHeight();

        Ladder ladder = new Ladder(gameParticipants.getParticipantSize(), height);

        ResultView.printResultMessage();
        ResultView.printResult(gameParticipants.getParticipants(), ladder);
    }
}
