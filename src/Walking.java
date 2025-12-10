public interface Walking {

    void walk();

    default void walkDefault() {
        System.out.println("Рух у стандартному режимі.");
        log("Walk activated");
    }

    static void info() {
        System.out.println("Walking — інтерфейс для руху пішки.");
    }

    private void log(String msg) {
        System.out.println("[WALK LOG] " + msg);
    }
}
