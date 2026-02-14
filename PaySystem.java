import java.util.ArrayList;

public class PaySystem {

    private ArrayList<Student> students;

    public PaySystem() {
        students = new ArrayList<Student>();
    }

    public void addStudent(String name) {
        students.add(new Student(name)); // create a new student in student class
    }

    public void addFunds(int idNo, int month, int day, double amount) {
        boolean idFound = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i); // i value where i is looping through
            if (s.getIdNo() == idNo) { // if id searching for is in the students list
                s.addFunds(month, day, amount); // new transaction
                idFound = true;
            }
        }
            if (idFound == false){
                System.out.println("Student ID number not found."); // if s.getIdNo does not match with the searching id there
            }
        }

    public void chargeLunch(int idNo, int month, int day) {
        boolean idFound = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i); // i value where i is looping through
            if (s.getIdNo() == idNo) {
                s.chargeLunch(month, day); // uses Students charge lunch method to subtract $7
                idFound = true;
            }
        }
         if (idFound == false){
                System.out.println("Student ID number not found."); // if s.getIdNo does not match with the searching id there
            }
    }

    public void showNegativeBalance() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
                if (s.getBalance() < 0){ // if balance is less than 0 it prints the student
                    System.out.println(s.toString());
                }
        }
    }

    public void TransactionByDay(int month, int day) {
        boolean idFound = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i); // keeps track of what student we are on/goes through students

            ArrayList<Transaction> thatDay = s.getTransactions(); // goes through that students transactions

            for (int j = 0; j < thatDay.size(); j++) {
                Transaction t = thatDay.get(j);

                if (t.getDate().equals((month + "/" + day))) { // if the dates are the same
                    System.out.println(t + "by " + s.getName() + " ID: " + s.getIdNo());
                    idFound = true;
                }
            }
        }

        if (idFound == false){
            System.out.println("There were no transactions on " + month + "/" + day); // if the date and month don't add
            }

    }

    public void displayStudentID(int idNo) {
        boolean idFound = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getIdNo() == idNo) {
                System.out.println(s); // using the toString()
                idFound = true;
            }
        }

        if (idFound == false){
        System.out.println("Student ID number not found."); // if s.getIdNo does not match with the searching id there
        }  
    }

    public String toString(){
        String toString = "";
        for (int i = 0; i < students.size(); i++){
            toString += students.get(i).toString();
            toString += "\n";
            }
        return toString;
    }
}
