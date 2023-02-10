package example3;

public interface Notifier {
    default void greeting() {
        System.out.println("Notifier is ready");
    }
    default void greeting2() {
        String answer = subAction();
        System.out.println(answer);
    }
    private String subAction() {
        return "Notifier is ready";
    }
}
