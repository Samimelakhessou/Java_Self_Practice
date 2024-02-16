package Day9_Tasks;

public class CommonElements {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};



        for (int i = 0; i < arr1.length; i++) {

            for (int i1 = 0; i1 < arr2.length; i1++) {

                if (arr1[i] == arr2 [i1]){

                    System.out.println(arr2[i1]);

                }

            }




        }



    }

}
