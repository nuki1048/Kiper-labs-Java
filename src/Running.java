public interface Running {

    void run();

    default void runDefault() {
        System.out.println("Біг у стандартному темпі.");
        log("Run activated");
    }

    static void info() {
        System.out.println("Running — інтерфейс для бігу.");
    }

    private void log(String msg) {
        System.out.println("[RUN LOG] " + msg);
    }
}
