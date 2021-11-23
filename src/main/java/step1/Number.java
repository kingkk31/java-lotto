package step1;

import java.util.Objects;

public class Number {

    private static final int MINIMUM_NUMBER = 0;

    private final int number;

    public Number(final String number) {
        this(Integer.parseInt(number));
    }

    public Number(int number) {
        this.number = number;
        validateNonNegative();
    }

    private void validateNonNegative() {
        if (this.number < MINIMUM_NUMBER) {
            throw new RuntimeException("입력 숫자는" + MINIMUM_NUMBER + "보다 작을 수 없습니다");
        }
    }

    public Number add(Number other) {
        return new Number(this.number + other.number);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !o.getClass().equals(Number.class)) {
            return false;
        }
        Number other = (Number) o;
        return this.number == other.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
