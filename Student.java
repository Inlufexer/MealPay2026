import java.util.ArrayList;

public class Student {
    private String name;
    private int idNo;
    private double balance;

    private static int idGen = 1;
    
    private ArrayList<Transaction> transactions;

    // Creating the student
    public Student(String myName){
        name = myName;
        balance = 0;
        idNo = idGen;
        idGen++;
        transactions = new ArrayList<Transaction>();
    }
    public String toString(){
        String s = "Name: " + name + " ID: " + idNo + " Balance: $" + balance;
        s += "Transactions: "; //adding transactions 
        for (Transaction t: transactions){ // looping through the transactions
                s += t; // adding the transactions
            }    
        return s;
    } 
}