public interface Swimming {

    void swim();

    default void swimDefault() {
        System.out.println("Пливу у спокійному режимі.");
        log("Плавання активоване.");
    }

    private void log(String msg) {
        System.out.println("[LOG SWIM] " + msg);
    }
}
