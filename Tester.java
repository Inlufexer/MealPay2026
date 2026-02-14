import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to the MealPay program!\n");
        System.out.println("Adding students to the program...\n");
        
        PaySystem paySystem = new PaySystem();

        paySystem.addStudent("A");
        paySystem.addStudent("B");
        paySystem.addStudent("C");
        paySystem.addStudent("D");

        System.out.println("Displaying students...");
        System.out.println(paySystem.toString());

        System.out.println("Adding some funds and making some purchases...");
        paySystem.addFunds(1,2, 1, 7);
        paySystem.addFunds(2,2, 2, 14);
        paySystem.addFunds(3,2, 3, 21);
        paySystem.addFunds(4,2, 4, 28);

        // charging lunch
        System.out.println();
        paySystem.chargeLunch(1, 2, 1);
        paySystem.chargeLunch(1, 2, 2);

        paySystem.chargeLunch(2, 2, 2);
        paySystem.chargeLunch(2, 2, 3);

        paySystem.chargeLunch(3, 2, 3);
        paySystem.chargeLunch(3, 2, 4);
    
        paySystem.chargeLunch(4, 2, 5);
        paySystem.chargeLunch(4, 2, 6);

        System.out.println(paySystem.toString());
        System.out.println("Displaying just those with negative balances...");
        paySystem.showNegativeBalance();

        System.out.println();
        System.out.println("Looking up student with ID number of 2:");
        paySystem.displayStudentID(2);


        System.out.println();
        System.out.println("Displaying all transactions on 2/4...");
        paySystem.transactionByDay(2, 4);
        

    }
}
