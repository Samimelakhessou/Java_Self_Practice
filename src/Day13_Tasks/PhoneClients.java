package Day13_Tasks;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Iphone", "10","6.1",1000,"Black");
        Samsung samsung = new Samsung("Samsung","6.5",1100,"White");
        Nokia nokia = new Nokia("Nokia", "6.5",760,"Orange");

        System.out.println(iPhone);
        iPhone.call("415-999-999");
        iPhone.text("415-999-999");

        System.out.println("------------------------");


        System.out.println(samsung);
        samsung.call("510-999-999");
        samsung.text("510-999-999");

        System.out.println("--------------------------");


        System.out.println(nokia);
        nokia.call("510-999-999");
        nokia.text("510-999-999");

    }
}
