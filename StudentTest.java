class Student{
    private int roll;
    private String name;
    private String course;
    private int m1;
    private int m2;
    private int m3;

    public Student(int roll,String name,String course,int m1, int m2, int m3){
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public int getroll(){return roll;}
    public String getname(){return name;}
    public String getcourse(){return course;}
    public int getm1(){return m1;}
    public int getm2(){return m2;}
    public int getm3(){return m3;}

    
}

public class StudentTest {
    public int total(int m1, int m2, int m3){
        return m1+m2+m3;
    }
    public int average(int m1, int m2, int m3){
        return (m1+m2+m3)/3;
    }
    public String grade(int average){
        if(average > 70){
            return "A";
        }
        else{
            return "B";
        }
    }

    public static void main(String[] args){
         Student s = new Student(1, "Sarth", "CS", 81, 60, 90);

        StudentTest st = new StudentTest();

        int total   = st.total(s.getm1(), s.getm2(), s.getm3());
        int average = st.average(s.getm1(), s.getm2(), s.getm3());
        String grade = st.grade(average);

        System.out.println("Roll    : " + s.getroll());
        System.out.println("Name    : " + s.getname());
        System.out.println("Course  : " + s.getcourse());
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
        

    }
}
