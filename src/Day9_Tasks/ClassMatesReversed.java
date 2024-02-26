package Day9_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {


        String[] classmates = {"Sami Sosa ", "Eren Acan", "Chris Barrientos",
                "William Torres", "Medi Messoudi",
                "Julio Ortiz", "Eren Acan", "Mayenci Mendoza",
                "John Omar", "Jesse Lujano", "Jack Cotrell"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";
            String name2 = name.toLowerCase();

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName = reverseName + name.charAt(j);

            }


            System.out.println(reverseName);
            System.out.println(name2);

        }


    }
}











