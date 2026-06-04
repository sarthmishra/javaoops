import java.util.*;
public class perfectnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int temp = n;
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
            
        }
        System.out.println("Sum is : "+sum);
        if(sum == n){
            System.out.print("Number is Perfect Number : "+sum);
        }
    }
}
