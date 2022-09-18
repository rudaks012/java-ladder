package step2.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    @DisplayName("높이와 넓이는 1 이상이여야 한다.")
    void width_and_height_is_must_least_one() {
        int width = 0;
        int height = 0;
        Assertions.assertThatThrownBy(() -> new Ladder(width,height))
                .isInstanceOf(LadderException.class)
                .hasMessageContaining("사다리의 넓이와 높이는 1이상의 숫자만 입력 가능합니다");

    }
}
