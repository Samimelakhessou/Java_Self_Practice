package Day13_Tasks;

public class IPhone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public IPhone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            System.err.println(" he 'brand', 'model', and 'color' must not be null, empty, or blank.");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (brand == null || brand.trim().isEmpty()) {
            System.err.println(" he 'brand', 'model', and 'color' must not be null, empty, or blank.");
            System.exit(1);
        }

        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price <= 0 ){
            System.err.println("The 'price' must be greater than zero.");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (brand == null || brand.trim().isEmpty()) {
            System.err.println(" he 'brand', 'model', and 'color' must not be null, empty, or blank.");
            System.exit(1);

        }
        this.color = color;
    }
    public void call (String phoneNumber){
        System.out.println("calling the number  " + phoneNumber);
    }
    public void text (String phonenumber){
        System.out.println("texting to the number " + phonenumber);

    }
    public void facetime (String phonenumber) {
        System.out.println("facetiming with the number" + phonenumber);


    }

    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
