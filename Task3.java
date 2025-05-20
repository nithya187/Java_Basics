interface Shape {
    void calculateArea();
}

class Rectangle implements Shape {
    int length = 5;
    int width = 4;
    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle implements Shape {
    int base = 4;
    int height = 3;
    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        r.calculateArea();
        t.calculateArea();
    }
}
