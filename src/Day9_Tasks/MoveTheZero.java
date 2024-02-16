package Day9_Tasks;

import java.util.Arrays;

public class MoveTheZero {

    public static void main(String[] args) {

        int[] Array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(Array);

        int [] reverse = new int [Array.length];

        for (int i = Array.length - 1, j = 0; i >= 0; i--, j++) {

            reverse [j] = Array[i];

        }
        System.out.println(Arrays.toString(reverse));






            }




        }


         

