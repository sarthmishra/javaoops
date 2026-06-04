import java.util.Scanner;
public class practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /*int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        float score  = sc.nextFloat();
        System.out.printf("Name: %s Age: %d Score: %.2f",name,age,score);*/
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++){
            String name = sc.nextLine();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            sc.nextLine();
            int total = m1+m2+m3;

            String grade;
            if(total >= 240){
                grade = "A";
            }
            else if(total >= 180){
                grade = "B";
            }
            else if(total >= 120){
                grade = "C";
            }
            else {
                grade = "D";
            }
        System.out.printf("%s  | "+ "total: %d" + " | " + "Grade: %s%n",name,total,grade);
        }
        

    }
}
