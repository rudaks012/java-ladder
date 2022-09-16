package step2;

import java.util.Objects;

public class Name {

    private final String name;

    public Name(final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("사람의 이름은 null 이거나 빈 값일 수가 없다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("사람의 이름은 최대 5글자 까지 부여할 수 있다.");
        }

        this.name = name;
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
