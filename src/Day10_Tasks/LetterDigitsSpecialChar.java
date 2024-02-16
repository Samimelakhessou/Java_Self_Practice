package Day10_Tasks;

public class LetterDigitsSpecialChar {

    public static void main(String[] args) {

        String str = "WoodenSpoon123!";
        String digits = "",
                letters = "",
                specialChars = "";


        for (char each1 :str.toCharArray()){

            if (Character.isLetter(each1)){

            letters += each1;

            }
        }

        for (char each :str.toCharArray()){
            if(Character.isDigit(each)){
                digits += each;



            }
        }


        for (char each3 :str.toCharArray()){
            if (!Character.isLetter(each3) && !Character.isDigit(each3)){
               specialChars += each3;

            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }
}
