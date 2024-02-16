package Day11_Tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping , numberOfPepproniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepproniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepproniTopping = numberOfPepproniTopping;

    }

    public int cost;
    public int calCost(){
        if (size == "small"){
            cost = 10 + 2 * ( numberOfCheeseTopping + numberOfPepproniTopping);
        } else if (size == "medium") {
            cost = 12 +  2 * (numberOfPepproniTopping + numberOfCheeseTopping);

        } else if (size == "large") {
            cost = 14 + 2 * (numberOfCheeseTopping+ numberOfCheeseTopping);

        }
        return cost;


    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepproniTopping=" + numberOfPepproniTopping +
                ", cost=" + cost +
                '}';
    }
}
