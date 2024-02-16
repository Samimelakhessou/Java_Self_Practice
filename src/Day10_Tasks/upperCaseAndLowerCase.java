package Day10_Tasks;

public class upperCaseAndLowerCase {

    public static void main(String[] args) {

        String str  ="JAVA java";
        int  uppercase = 0;
        int  lowercase = 0;


        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {

                  uppercase++;

            } else if (Character.isLowerCase(each)){

                lowercase++;


            }

        }

        System.out.println(uppercase == lowercase);



        }
    }


