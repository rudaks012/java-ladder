package step2;

import step2.domain.Ladder;
import step2.domain.LadderGame;
import step2.ui.InputView;

public class LadderGameApplication {

    public static void main(String[] args) {
        final String[] names = InputView.names();
        final int ladderMaxHeight = InputView.maxLadderHeight();

        final LadderGame ladderGame = new LadderGame(names, ladderMaxHeight);
    }
}
