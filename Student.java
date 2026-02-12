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

    //getter for name
    public String getName(){
        return name;
    }

    //getter for idNo
    public int getIdNo(){
        return idNo;
    }

    //getter for balance
    public double getBalance(){
        return balance;
    }

    //add money
    public void addFunds(int month, int day, double amount){
        balance = balance + amount; //adding the amount the user wants 
        transactions.add(new Transaction(month, day, amount)); 
    }

    //charge Lunch 
    public void chargeLunch (int month, int day){
        balance = balance - 7.0; //lunch costs seven dollars
        transactions.add(new Transaction(month, day, -7.0));
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
