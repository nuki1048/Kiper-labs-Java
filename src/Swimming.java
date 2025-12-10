public interface Swimming {

    void swim();

    default void swimDefault() {
        System.out.println("Плавання у стандартному режимі.");
        log("Swim activated");
    }

    static void info() {
        System.out.println("Swimming — інтерфейс для плавання.");
    }

    private void log(String msg) {
        System.out.println("[SWIM LOG] " + msg);
    }
}
