public interface Running {

    void run();

    default void runDefault() {
        System.out.println("Біжу у стандартному темпі.");
        log("Біг активований.");
    }

    private void log(String msg) {
        System.out.println("[LOG RUN] " + msg);
    }
}
