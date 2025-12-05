public interface Walking {

    void walk();

    default void walkDefault() {
        System.out.println("Рухаюсь у звичайному режимі ходьби.");
        log("Ходьба активована.");
    }

    private void log(String msg) {
        System.out.println("[LOG WALK] " + msg);
    }
}
