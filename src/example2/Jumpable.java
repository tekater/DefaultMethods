package example2;

public interface Jumpable {
    void jump();
    void turnLeftJump();
    void turnRightJump();
    default void turnAround(){
        turnLeftJump();
        turnRightJump();
    }
}
