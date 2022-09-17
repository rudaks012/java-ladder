package step2.domain;

import java.util.List;

public class GameParticipants {

    public static final String THROW_MESSAGE_GAME_PARTICIPANTS_TWO_DOWN = "게임 참석자가 2명 미만이면 예외가 발생한다.";
    private final List<String> participants;

    public GameParticipants(final String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException(THROW_MESSAGE_GAME_PARTICIPANTS_TWO_DOWN);
        }
        this.participants = List.of(names);
    }

    public int getNames() {
        return participants.size() -1;
    }

    public List<String> getParticipants() {
        return participants;
    }
}
