package step2.domain;

public class LadderException extends RuntimeException {

    public static final String MESSAGE_THROW_WIDTH_HEIGHT_LIMIT = "사다리의 넓이와 높이는 1이상의 숫자만 입력 가능합니다 : 입력값 : %d , %d";

    public LadderException(int width, int height) {
        super(String.format(MESSAGE_THROW_WIDTH_HEIGHT_LIMIT, width, height));
    }
}
