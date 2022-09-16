package step2.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameParticipants {

    private final List<Ladder> ladders;

    public GameParticipants(final String[] names) {
        this.ladders = createLadder(names);
    }

    private List<Ladder> createLadder(String[] names) {
        return Arrays.stream(names)
                .map(Ladder::new)
                .collect(Collectors.toUnmodifiableList());
    }
}
