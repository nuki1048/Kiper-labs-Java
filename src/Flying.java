public interface Flying {

    void fly();

    default void flyDefault() {
        System.out.println("Політ у стандартному режимі.");
        log("Fly activated");
    }

    static void info() {
        System.out.println("Flying — інтерфейс для польоту.");
    }

    private void log(String msg) {
        System.out.println("[FLY LOG] " + msg);
    }
}
