public class Animal extends Being implements Walking, Running, Swimming {

    public Animal(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void walk() {
        System.out.println(name + " рухається кроком.");
    }

    @Override
    public void run() {
        System.out.println(name + " біжить швидко.");
    }

    @Override
    public void swim() {
        System.out.println(name + " пливе.");
    }
}
