import java.util.*;
public class pp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
                int num = arr[i];
                int temp = num;
                long fact = 1;
                for(int j = 2; j <= num; j++){
                    fact *= j;
                }
                boolean isprime;
                
                if(num <= 1) isprime = false;
                if(num == 2) isprime = true;
                if(num % 2 == 0) isprime = false;
                isprime = true;
                for(int j = 3; j *j < num; j+=2){
                    if(num % j == 0){
                        isprime = false;
                        break;
                    }
                    
                }
                int digitsum = 0, rev = 0, t = num;
                while(t > 0){
                    int d = t % 10;
                    rev = rev * 10 + d;
                    digitsum += d;
                    t /= 10;
                    
                    
                }
                boolean ispalindrome = (rev == num);
                System.out.printf("%d: Factorial=%d, Prime=%s, Palindrome=%s, DigitSum=%d%n",
                    num, fact,
                    isprime ? "Yes" : "No",
                    ispalindrome ? "Yes" : "No",
                    digitsum);
        }
    }
}
