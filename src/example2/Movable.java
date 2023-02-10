package example2;

public interface Movable {
    void stepAhead();
    void turnLeft();
    void turnRight();
    default void turnDash() {
        turnLeft();
        turnRight();
    }
}
