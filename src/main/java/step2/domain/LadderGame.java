package step2.domain;

public class LadderGame {

    private final GameParticipants gameParticipants;
    private int ladderMaxHeight;

    public LadderGame(String[] names, int ladderMaxHeight) {
        this.gameParticipants = new GameParticipants(names);
        this.ladderMaxHeight = ladderMaxHeight;
    }
}
