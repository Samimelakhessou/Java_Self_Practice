package Day11_Tasks;

public class Carpet {

    public double width;
    public double lengh;
    public boolean isPersian;
    public double unitPrice;
    public double cost;

    public Carpet(double width, double lengh, boolean isPersian, double unitPrice) {
        this.width = width;
        this.lengh = lengh;
        this.isPersian = isPersian;
        this.unitPrice = unitPrice;
    }



    public double calCost (){

               cost  =(width * lengh) * unitPrice;

               if (isPersian){
                   cost = cost + 200;
               }

        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", lengh=" + lengh +
                ", isPersian=" + isPersian +
                ", unitPrice=" + unitPrice +
                ", cost=" + cost +
                '}';
    }
}
