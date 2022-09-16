package step2.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameParticipants {

    private final List<Ladder> ladders;

    public GameParticipants(final String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException("게임 참석자가 2명 미만이면 예외가 발생한다.");
        }
        this.ladders = createLadder(names);
    }

    private List<Ladder> createLadder(String[] names) {
        return Arrays.stream(names)
                .map(Ladder::new)
                .collect(Collectors.toUnmodifiableList());
    }
}