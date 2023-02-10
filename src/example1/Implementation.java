package example1;

public class Implementation implements Feature{

    @Override
    public void getDigit() {

    }

    @Override
    public void action() {
        //Feature.super.action();
        System.out.println("Feature Implementation \nСамобытный метод");
    }

}
