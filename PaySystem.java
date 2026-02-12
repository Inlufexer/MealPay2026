import java.util.ArrayList;

public class PaySystem {

    private ArrayList<Student> students;
        
    public void addStudent(String name){
        students.add(new Student(name));
    }

    public void addFunds(int idNo, int month, int day, double amount) {
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i); //i value where i is looping through
            if (s.getIdNo() == idNo){ //if id searching for is in the students list
                s.addFunds(month, day, amount); //new transaction
            }
        }
        System.out.println("Student ID number not found."); //if s.getIdNo does not match with the searching id there is no profile

    }

    public void chargeLunch(int idNo, int month, int day){
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i); //i value where i is looping through
            if (s.getIdNo() == idNo){
                s.chargeLunch(month, day);  //uses Students charge lunch method to subtract $7
            }
        }

    }

    public void showNegativeBalance(){
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
                if (s.getBalance() < 0){ // if balance is less than 0 it prints the student
                    System.out.println(s);
                }
        }
    }

    public void TransactionByDay(int month, int day){
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
        }

    }

    public void displayStudent(int idNo){
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            if (s.getIdNo() == idNo){
                s.toString(); //using the toString()

            }
        }
        System.out.println("Student ID number not found."); //if s.getIdNo does not match with the searching id there is no profile
    }
}
