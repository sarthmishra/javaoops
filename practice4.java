import java.util.*;
public class practice4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[2*n];
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            
                arr3[2*i] = arr1[i];
                arr3[2*i+1] = arr2[i];
            sum += arr3[2*i];
            sum += arr3[2*i+1];
            if(sum % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
            
        }
        for(int  i= 0; i < 2*n; i++){
            System.out.print(arr3[i]);
            }
    }
}
