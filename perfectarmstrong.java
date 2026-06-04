import java.util.*;
public class perfectarmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            for(int i = 0; i < n; i++){
                int num = arr[i];

            int divsum = 0;
            for(int j = 1; j <= num/2; j++){
                if(num % j == 0){
                    divsum += j;
                }
            }
                boolean isperfect = (divsum == num);
            
                int temp = num; int digits = 0;
                while(temp > 0){
                    digits++;
                    temp /= 10;
                }
                temp = num;
                int armstr = 0;
                while(temp > 0){
                    int d = temp % 10;
                    armstr += (int)Math.pow(d, digits);
                    temp /= 10;
                }
                boolean isArmstrong = (armstr == num);
                if(isperfect && isArmstrong) System.out.println(num + " Both");
            else if (isperfect)                System.out.println(num + " Perfect");
            else if (isArmstrong)              System.out.println(num + " Armstrong");
            else                               System.out.println(num + " Neither");
            
            
        }
    }
}
