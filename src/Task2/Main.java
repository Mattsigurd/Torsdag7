package Task2;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);

        try {
            myCircle.setRadius(-3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
    }
}