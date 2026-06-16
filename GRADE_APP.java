import java.util.*;
class Student{
    private String name;
    private int Roll_No;
    private int Marks;
    //private String Grade;

    public Student(String name,int Roll_No,int Marks/*String Grade */){
        this.name = name;
        this.Roll_No = Roll_No;
        this.Marks = Marks;
        //this.Grade = Grade;
        }
    
        public String getName(){return name;}
        public int getRoll(){return Roll_No;}
        public int getMarks(){return Marks;}
        public void display() {
        System.out.println("Name  : " + name);
        System.out.println("Roll  : " + Roll_No);
        System.out.println("Marks : " + Marks);
    }
}


class Grade_Manager{
    private Student GoStudent;
    Scanner sc = new Scanner(System.in);
    private Student[] studentData = {
        new Student("Sarth",123,89),
        new Student("Muskan",321, 95)
    };
     private Student findStudent(int rollNo) {
        for (Student s : studentData) {
            if (s.getRoll() == rollNo) return s;
        }
        return null;
    }
     private boolean selectStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNo = Integer.parseInt(sc.nextLine());

        GoStudent = findStudent(rollNo);

        if (GoStudent == null) {
            System.out.println("Student not found.");
            return false;
        }

        System.out.println("Student found: " + GoStudent.getName());
        return true;
    }

    public void ShowMenu(){
        int choice;
        do{
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Name");
            System.out.println("2. Roll_no.");
            System.out.println("3. Marks");
            System.out.println("4. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice ){
                case 1: checkname(); break;
                case 2: checkroll(); break;
                case 3: checkmarks(); break;
                case 4: System.out.println("Thank you. Goodbye!"); break;
                default: System.out.println("Invalid option.");
            } 
        }while(choice != 4);
    }
     private boolean isSelected() {
        if (GoStudent == null) {
            System.out.println("Please search a student first (option 1).");
            return false;
        }
        return true;
    }
    private void checkname(){
        System.out.print("The Student's Name is "+GoStudent.getName());
    }
    private void checkroll(){
        System.out.print("The Student's roll is "+GoStudent.getRoll());
    }
    private void checkmarks(){
        System.out.print("The Student's Mark is "+GoStudent.getMarks());
    }
    private void viewAll() {
        System.out.println("\n===== ALL STUDENTS =====");
        for (Student s : studentData) {
            s.display();
            System.out.println("--------");
        }
    }
}




public class GRADE_APP{
    public static void main(String[] args){
        Grade_Manager G = new Grade_Manager();
        System.out.println("===== Welcome to the STUDENT DATABASE =====");
        G.ShowMenu();
    }
}