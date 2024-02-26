package Day13_Tasks;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA", "Republican", "Glenn Youngkin", "Mark Warner", 8000000);
        California california = new California("California", "CA", "Democrat", "Gavin Newsome", "Dianne Feinstein", 39000000);
        Texas texas = new Texas("Texas", "TX", "Republican", "Greg Abbott", "Ted Cruz", 29000000);
        Florida florida = new Florida("Florida", "FL", "Republican", "Ron Desantis", "Rick Scott", 21000000);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);



    }
}
