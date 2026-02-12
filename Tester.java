public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to MealPay Program\n");
        System.out.println("Adding students to the program...");

        System.out.println("Displaying Students...");
        PaySystem paySystem = new PaySystem();
        paySystem.addStudent("A");
        paySystem.addStudent("B");
        paySystem.addStudent("C");
        paySystem.addStudent("D");
    }
}
