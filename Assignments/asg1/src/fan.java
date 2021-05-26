public class fan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    int speed = slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean getOn() {
        return this.on;
    }

    public fan() {
        setColor(color);
        setOn(on);
        setRadius(radius);
        setSpeed(speed);
    }

    public String toString() {
        if (this.on == true) {
            return ("Speed: " + getSpeed() + "\tColor: " + getColor() + "\tRadius: " + getRadius());
        } else {
            return ("Fan in off" + "\tColor: " + getColor() + "\tRadius: " + getRadius());
        }
    }

    public static void main(String[] args) {
        fan f1 = new fan();
        fan f2 = new fan();
        f1.setColor("Yellow");
        f1.setOn(true);
        f1.setRadius(10);
        f1.setSpeed(fast);

        f2.setColor("Blue");
        f2.setOn(false);
        f2.setRadius(5);
        f2.setSpeed(fast);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
