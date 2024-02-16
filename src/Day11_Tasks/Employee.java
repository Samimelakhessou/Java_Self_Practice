package Day11_Tasks;

public class Employee {



        public String name;
        public int age;
        public char gender;
        public String jobTitle;
        public double salary;


        public Employee(String name, int age, char gender, String jobTitle, double salary) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public void work(){
            System.out.println(jobTitle + name + "  is working");
        }

        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }


