import java.util.*;
public class May23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int T = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int start = -1;
        int end = -1;
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == T){
                    int length = j - i + 1;
                    if(length > maxLength){
                        maxLength = length;
                        start = i;
                        end = j;
                    }
                }
                
            }
        }
        System.out.println(
            "Longest subarray with sum " + T +": start=" + start +" end=" + end + " length=" + maxLength);
        
    }
}