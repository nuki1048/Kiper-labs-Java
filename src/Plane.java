public class Plane extends Being implements Flying {

    public Plane(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void fly() {
        System.out.println(name + " виконує політ.");
    }
}
