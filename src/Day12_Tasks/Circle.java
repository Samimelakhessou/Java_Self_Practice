package Day12_Tasks;

public class Circle {

    public double radius;




    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("The radius cannot be set to a negative or zero");
            System.exit(0);

        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius* radius * 3.14;

    }
    public double calcperimeter(){
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}




