package example3;

public class Main {
    public static void main(String[] args){
        Printer printer = new ConsoleWriter();
        printer.greeting();

        System.out.println();

        Notifier notifier = new ConsoleWriter();
        notifier.greeting2();

    }
}
