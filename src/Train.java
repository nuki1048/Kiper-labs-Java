public class Train extends Being implements Walking {

    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void walk() {
        System.out.println(name + " рухається по рейках.");
    }
}
