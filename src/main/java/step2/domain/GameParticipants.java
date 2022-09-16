package step2.domain;

public class GameParticipants {

    public GameParticipants(final String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException("게임 참석자가 2명 미만이면 예외가 발생한다.");
        }
    }
}
