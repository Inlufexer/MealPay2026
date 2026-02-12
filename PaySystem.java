import java.util.ArrayList;

public class PaySystem {

    private ArrayList<Student> students;
        
    public void addStudent(String name){
        students.add(new Student(name));
    }

    public void addFunds(int idNo, double amount, String date) {

    }

    public void chargeLunch(int idNO){

    }

    public void showNegativeBalance(){

    }

    public void TransactionByDay(){

    }

    public int displayStudent(int idNo){
        return 1;
        //toString()
    }
    
}
