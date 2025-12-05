public abstract class Being implements Comparable<Being>, Cloneable {

    protected String name;
    protected int speed;

    public Being(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public Being(Being other) {
        this.name = other.name;
        this.speed = other.speed;
    }

    @Override
    public int compareTo(Being other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public Being clone() {
        try {
            return (Being) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return name + " (швидкість: " + speed + ")";
    }
}
