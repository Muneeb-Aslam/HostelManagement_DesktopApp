import java.text.DecimalFormat;

public class RegularPolygone {
    int n;
    double side;
    double x;
    double y;
    final float pie = 3.1462f;

    RegularPolygone() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygone(int n, double side) {
        this.side = side;
        this.n = n;
        x = 0;
        y = 0;
    }

    RegularPolygone(int n, double side, double x, double y) {
        this.side = side;
        this.n = n;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(pie / n));

    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        DecimalFormat ans = new DecimalFormat("#.##");
        RegularPolygone p1 = new RegularPolygone();
        RegularPolygone p2 = new RegularPolygone(6, 4);
        RegularPolygone p3 = new RegularPolygone(10, 4, 5.6, 7.8);
        System.out.println("Area is: " + ans.format(p1.getArea()));
        System.out.println("Perimeter is: " + ans.format(p1.getPerimeter()));
        System.out.println("Area is: " + ans.format(p2.getArea()));
        System.out.println("Perimeter is: " + ans.format(p2.getPerimeter()));
        System.out.println("Area is: " + ans.format(p3.getArea()));
        System.out.println("Perimeter is: " + ans.format(p3.getPerimeter()));

    }

}