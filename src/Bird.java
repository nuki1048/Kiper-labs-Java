public class Bird extends Being implements Walking, Running, Flying {

    public Bird(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void walk() { System.out.println(name + " пересувається по землі."); }

    @Override
    public void run() { System.out.println(name + " перебігає."); }

    @Override
    public void fly() { System.out.println(name + " летить у небі."); }
}
