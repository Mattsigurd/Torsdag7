package Task2;

public class Circle {
    private double radius;
    public Circle(int x) {
        this.radius = x;
    }

    public void setRadius(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("Radius must be positive");
        }
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}