package example2;

public class KazuyaKazama implements Movable, Jumpable{
    @Override
    public void jump() {

    }

    @Override
    public void turnLeftJump() {

    }

    @Override
    public void turnRightJump() {

    }

    @Override
    public void turnAround() {
        Jumpable.super.turnAround();
    }

    @Override
    public void stepAhead() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnDash() {
        Movable.super.turnDash();
    }
}
