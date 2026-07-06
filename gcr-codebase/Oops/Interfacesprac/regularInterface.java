interface Shape {
    void draw();
    double getArea();
}

class Circle implements Shape {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    public void draw() {
        System.out.println("Drawing Circle");
    }
    
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    
    public double getArea() {
        return length * width;
    }
}

public class regularInterface {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        
        s1.draw();
        System.out.println("Area: " + s1.getArea());
        
        s2.draw();
        System.out.println("Area: " + s2.getArea());
    }
}
