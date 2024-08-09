public class Circle {
    public static void main(String[] args) {
        CircleStructure fc = new CircleStructure(50);
        fc.radius = 50;
        fc.calculateArea();
        fc.calculatePerimeter();
        fc.displayResult();

        CircleStructure sc = new CircleStructure(20);
        sc.radius = 50;
        sc.calculateArea();
        sc.calculatePerimeter();
        sc.displayResult();
    }
}

class CircleStructure {
    double radius;
    double area;
    double perimeter;

    CircleStructure(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = radius * radius * Math.PI;
    }

    void calculatePerimeter() {
        perimeter = 2 * radius * Math.PI;
    }

    void displayResult() {
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
