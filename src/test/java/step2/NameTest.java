package step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.ThrowableAssert.ThrowingCallable;

public class NameTest {

    @Test
    @DisplayName("사람에 이름을 최대 5글자 까지 부여할 수 있다.")
    void person_name_max_five_letters() {
        final ThrowingCallable actual = () -> new Name("가나다라마바");

        assertThatThrownBy(actual)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사람의 이름은 최대 5글자 까지 부여할 수 있다.");
    }

    @ParameterizedTest(name = "사람의 이름은 null 이거나 빈 값일 수가 없다. :[{index}] : [{arguments}]")
    @DisplayName("사람의 이름은 null 이거나 빈 값일 수가 없다.")
    @NullAndEmptySource
    void throw_exception_person_name_is_not_null_and_empty(String name) {
        final ThrowingCallable actual = () -> new Name(name);

        assertThatThrownBy(actual)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사람의 이름은 null 이거나 빈 값일 수가 없다.");
    }
}
