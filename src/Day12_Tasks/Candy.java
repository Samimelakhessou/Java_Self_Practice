package Day12_Tasks;

public class Candy {

    public String brand;
    public int quantity;
    public double price;
    public boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {

        if (price < 0 ){
            System.out.println("The price of candy cannot be set to a negative value.");
            System.exit(1);
        }
        if (quantity <= 0 ){
            System.out.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }

        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
