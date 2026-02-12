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
    }
}
