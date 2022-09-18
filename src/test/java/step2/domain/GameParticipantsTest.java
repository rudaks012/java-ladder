package step2.domain;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameParticipantsTest {

    @Test
    @DisplayName("게임 참석자가 2명 미만이면 예외가 발생한다.")
    void throw_exception_game_participants_two_more() {
        // given
        final ThrowableAssert.ThrowingCallable actual = () -> new GameParticipants(new String[]{"1"});

        assertThatThrownBy(actual)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("게임 참석자가 2명 미만이면 예외가 발생한다.");
    }

    @Test
    @DisplayName("게임 참석자가 2명 이상이어야 한다.")
    void game_participant_two_more() {
        // given
        GameParticipants gameParticipants = new GameParticipants(new String[]{"123", "456", "789"});
        // when
        int actual = gameParticipants.getParticipants().size();
        int expected = 3;
        // then
        assertThat(actual).isEqualTo(expected);
    }
}
