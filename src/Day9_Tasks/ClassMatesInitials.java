package Day9_Tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String [] classmates = {"Sami Sosa ", "Eren Acan", "Chris Barrientos",
                                "William Torres", "Medi Messoudi", 
                                "Julio Ortiz", "Eren Acan", "Mayenci Mendoza", 
                                "John Omar","Jesse Lujano", "Jack Cotrell"};
        
        String[]  Initials = new String[classmates.length];

        for (int i = 0; i < Initials.length; i++) {

            Initials [i] = classmates[i].charAt(0) + "" + classmates[i].charAt(classmates[i].indexOf(" ")+ 1);


            
        }
        System.out.println(Arrays.toString(Initials));
        
        




    }

}
