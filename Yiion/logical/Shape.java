
public class Shape {
    int radius = 5;
        public void Area() {
            double Area = 2 * 3.14 * radius;
            System.out.println("Area  of shape is " + Area);
        }

    }

class Circle extends Shape{
    public static void main(String[] args) {
        Circle c = new Circle();

        c.Area();

    }

}
