package example3;

public class ConsoleWriter implements Printer, Notifier {
    public void greeting() {
        Printer.super.greeting();
    }

    @Override
    public void greeting2() {
        Notifier.super.greeting2();
    }

}
