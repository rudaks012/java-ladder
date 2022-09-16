package step2;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step2.domain.GameParticipants;

public class GameParticipantsTest {

    @Test
    @DisplayName("게임 참석자가 2명 미만이면 예외가 발생한다.")
    void throw_exception_game_participants_two_more() {
        // given
        final ThrowableAssert.ThrowingCallable actual = () -> new GameParticipants(new String[]{"1"});

        Assertions.assertThatThrownBy(actual)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("게임 참석자가 2명 미만이면 예외가 발생한다.");
    }
}
