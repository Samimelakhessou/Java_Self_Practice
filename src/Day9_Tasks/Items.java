package Day9_Tasks;

public class Items {


        public static void main(String[] args) {

            String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
            double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
            int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

            int indexNumOfGloves = 0;
            boolean hasIPad = false;
            String report = "";

            for (int i = 0; i < items.length; i++) {

                if (items.equals("Gloves")){
                    indexNumOfGloves = i;

                } else if (items.equals("ipad")) {
                    hasIPad = true;
                    
                }

                report += items + " - " + prices + " - #" + itemIDs + "\n";

            }

            System.out.println("indexNumOfGloves = " + indexNumOfGloves);
            System.out.println("hasIPad = " + hasIPad);






        }

    }



