import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to the MealPay program!\r\n" + //
                        "\r\n" + //
                        "Adding students to the program...");
        
        PaySystem paySystem = new PaySystem();
        paySystem.addStudent("A");
        paySystem.addStudent("B");
        paySystem.addStudent("C");
        paySystem.addStudent("D");

        System.out.println(paySystem.toString());

        System.out.println("Adding some funds and making some purchases...");
        paySystem.addFunds(1,2, 1, 7);
        paySystem.addFunds(2,2, 2, 14);
        paySystem.addFunds(3,2, 3, 21);
        paySystem.addFunds(4,2, 4, 28);

        // charging lunch
        paySystem.chargeLunch(1, 2, 1);
        paySystem.chargeLunch(1, 2, 2);

        paySystem.chargeLunch(2, 2, 2);
        paySystem.chargeLunch(2, 2, 3);

        paySystem.chargeLunch(3, 2, 3);
        paySystem.chargeLunch(3, 2, 4);
    
        paySystem.chargeLunch(4, 2, 5);
        paySystem.chargeLunch(4, 2, 6);

        System.out.println(paySystem.toString());

    }
}
