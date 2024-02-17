package Day12_Tasks;

public class Item {

    public String name;
    public int unitprice;
    public int quantity;

    public Item(String name, int unitprice, int quantity) {

            if (name == null || name.trim().isEmpty()) {
                System.err.println("Name cannot be empty or blank.");
                System.exit(1);


        }
            if (unitprice < 0) {
            System.out.println("The unitPrice cannot be negative.");
                System.exit(1);

        }
            if (quantity < 0) {
            System.out.println("The quantity cannot be negative.");
                System.exit(1);

        }


        this.name = name;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }
    public int calcCost(){
        return unitprice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitprice=" + unitprice +
                ", quantity=" + quantity +
                '}';
    }
}
