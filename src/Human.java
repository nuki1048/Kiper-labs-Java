public class Human extends Being implements Walking, Running, Swimming {

    public Human(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void walk() { System.out.println(name + " йде пішки."); }

    @Override
    public void run() { System.out.println(name + " біжить."); }

    @Override
    public void swim() { System.out.println(name + " пливе."); }
}
