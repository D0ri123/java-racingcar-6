package racingcar.model;

public class Car {
    private static final int LENGTH_OF_NAME = 5;

    String name;
    int meter;

    public Car(String name) {
        validateLength(name);
        this.name = name;
        this.meter = 0;
    }

    public void moveOrNot(int randomNumber) {
        if(randomNumber >= 4) {
            meter++;
        }
    }

    private void validateLength(String name) {
        if(name.length() > LENGTH_OF_NAME) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
    }

}
