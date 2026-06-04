import java.util.*;
public class sundays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        String days[] = {"mon","tue","wed","thu","fri","sat","sun"};
        int i;
        for(i = 0 ; i < days.length; i++){
            if(days[i].equals(day)){
               break;
            }
        }
            int count = 1;
            int rem = 6 - i;
            n = n - rem;
            if(n > 0){
                count += n/7;
                System.out.print(count);
            
        }

    }
}
