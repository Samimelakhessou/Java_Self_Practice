package Day9_Tasks;

import java.util.Arrays;

public class ArrayElement {

    public class ArrayElements {

        public static void main(String[] args) {

            int[] array = new int[100];
            int[] reverse = new int[100];



            for (int i = 0; i < array.length; i++) {

                array[i] = i + 1;

            }
            for (int i = reverse.length - 1, j = 0; i > 0; i--, j++) {

                reverse[j] = array[i];


            }

            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(reverse));

            for (int element : array){

                if (element % 5 == 0 ){

                    System.out.print(element + " ");
                }
            }


        }




    }










}
