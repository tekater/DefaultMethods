package example3;

public interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
    default void greeting2() {
        String answer = subAction();
        System.out.println(answer);
    }
    private String subAction() {
        return "Printer is ready";
    }

}
