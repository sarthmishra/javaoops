import java.util.*;
public class armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int digits = 0;
        int sum = 0;
        int original = n;
        int temp = n;
        while(temp > 0){
            digits++;
            temp /= 10;
        }
        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println("Armstrong number is "+sum);
        if(sum == original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
