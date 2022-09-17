package step2.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameParticipants {

    public static final String THROW_MESSAGE_GAME_PARTICIPANTS_TWO_DOWN = "게임 참석자가 2명 미만이면 예외가 발생한다.";
    public static final int GAME_PARTICIPANT_LIMIT = 2;
    private final List<Name> participants;

    public GameParticipants(final String[] names) {
        validatePersonnel(names);
        this.participants = createName(names);
    }

    private static void validatePersonnel(String[] names) {
        if (names.length < GAME_PARTICIPANT_LIMIT) {
            throw new IllegalArgumentException(THROW_MESSAGE_GAME_PARTICIPANTS_TWO_DOWN);
        }
    }

    private List<Name> createName(String[] names) {
        return Arrays.stream(names)
                .map(Name::new)
                .collect(Collectors.toUnmodifiableList());
    }

    public int getParticipantSize() {
        return participants.size() - 1;
    }

    public List<Name> getParticipants() {
        return participants;
    }
}
