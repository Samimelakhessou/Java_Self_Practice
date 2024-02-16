package Day9_Tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] Array = {1,2,3,4,5};
        int [] reversedArray = new int [Array.length];

        for (int i = Array.length - 1,j = 0; i >= 0; i--, j++) {

            reversedArray[j] = Array[i];

            }

        System.out.println(Arrays.toString(reversedArray));


        }



            }











