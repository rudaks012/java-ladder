package step2.domain;

public class NameException extends RuntimeException {

    public static final String MESSAGE_NAME_MAX_FIVE_LENGTH = "사람의 이름은 최대 5글자 까지 부여할 수 있다. 입력값 : %s";

    public NameException(String name) {
        super(String.format(MESSAGE_NAME_MAX_FIVE_LENGTH, name));
    }
}
