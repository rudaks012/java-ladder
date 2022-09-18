package step2.domain;

import java.util.Objects;

public class Name {

    public static final int MAX_LENGTH = 5;
    public static final String MESSAGE_NAME_MAX_FIVE_LENGTH = "사람의 이름은 최대 5글자 까지 부여할 수 있다.";
    public static final String MESSAGE_NAME_NOT_NULL_OR_EMPTY = "사람의 이름은 null 이거나 빈 값일 수가 없다.";

    private final String name;

    public Name(String name) {
        validation(name);
        this.name = name;
    }

    private static void validation(String name) {
        validateEmpty(name);
        validateLength(name);
    }

    private static void validateLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new NameException(name);
        }
    }

    private static void validateEmpty(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(MESSAGE_NAME_NOT_NULL_OR_EMPTY);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
