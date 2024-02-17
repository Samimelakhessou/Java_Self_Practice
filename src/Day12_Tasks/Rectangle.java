package Day12_Tasks;

public class Rectangle {

    public double width;
    public double length;

    public Rectangle(double width, double length) {

        if (width<= 0 || length <= 0){

        System.out.println("The width and length cannot be set to negative or zero values");
        System.exit(0);
    }
        this.width = width;
        this.length = length;

    }

    public double calcArea(){
        return length * width ;
    }

    public double calcPerimeter () {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
