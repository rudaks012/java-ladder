package step2.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LadderTest {

    @ParameterizedTest(name = "높이와 넓이는 1 이상이여야 한다. : [{index}] : [{arguments}]")
    @DisplayName("높이와 넓이는 1 이상이여야 한다.")
    @CsvSource(value = {
            "0,0",
            "0,1",
            "1,0"
    })
    void width_and_height_is_must_least_one(int width, int height) {
        Assertions.assertThatThrownBy(() -> new Ladder(width, height))
                .isInstanceOf(LadderException.class)
                .hasMessageContaining("사다리의 넓이와 높이는 1이상의 숫자만 입력 가능합니다");
    }
}
