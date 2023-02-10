package example1;

interface Feature {
    void getDigit();
    default void action() {
        System.out.println("Default action");
    }
    default void action2() {
        String answer = subAction();
        System.out.println(answer);
    }
    // Для декомпозиции какого-либо большого дефолтного метода
    // Java позволяет нам декларировать приватные методы в интерфейсе
    private String subAction() {
        return "Default Action";
    }
}
