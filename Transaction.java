public class Transaction {
    private int month;
    private int day;
    private double amount;

    public Transaction(int myMonth, int myDay, double myAmount){
        month = myMonth;
        day = myDay;
        amount = myAmount;
    }

    public String getDate(){
        return month + "/" + day;
    }

    public double getAmount(){
        return amount;
    }

    public String toString(){
        return "Date: " + getDate() + " Amount: " + getAmount();
    }
}