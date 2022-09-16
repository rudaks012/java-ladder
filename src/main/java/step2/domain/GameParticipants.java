package step2.domain;

import java.util.List;

public class GameParticipants {

    private final List<String> participants;

    public GameParticipants(final String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException("게임 참석자가 2명 미만이면 예외가 발생한다.");
        }
        this.participants = List.of(names);
    }

    public int size() {
        return participants.size();
    }

    public List<String> getParticipants() {
        return participants;
    }
}
