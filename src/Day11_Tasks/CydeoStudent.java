package Day11_Tasks;

public class CydeoStudent {


        public String name;
        public int age, id,groupNumber;
        public char grade;
        public static String schoolName = "Cydeo";
        public static String programingLanguage = "Java";

        public CydeoStudent(String name, int age, int id, int groupNumber, char grade) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.groupNumber = groupNumber;
            this.grade = grade;
        }

        public void study (){
            System.out.println(name + " is Studying");
        }
        public  void attendClass(){
            System.out.println( name + "  is attending the live class");
        }
        public void printSchoolName (){
            System.out.println(schoolName);
        }
        public void printProgramLanguage (){
            System.out.println(programingLanguage);
        }

        public String toString() {
            return "CydeoStudent{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    ", groupNumber=" + groupNumber +
                    ", grade=" + grade +
                    '}';
        }
    }


