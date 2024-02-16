package Day9_Tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[]array = {1, 2, 3, 4, 5, 6, 7};

            int evencount = 0;
            int oddCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0){
                evencount++;

        }
            else {oddCount++;}

        }
        System.out.println("The array has " + oddCount + " odd numbers and " + evencount + " even numbers");




                }

        }









    //public static int SumOfOddNumbers(int[]numbers){

        //int sum = 0;

       // for (int number : numbers) {

          //  if (number % 2 != 0){
             //   sum += number;

