public interface Flying {

    void fly();

    default void flyDefault() {
        System.out.println("Лечу у звичайному режимі.");
        log("Політ активований.");
    }

    private void log(String msg) {
        System.out.println("[LOG FLY] " + msg);
    }
}
