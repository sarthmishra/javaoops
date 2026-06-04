import java.util.*;
public class practice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
          
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }*/
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int[] arr = new int[n1];
       int[] arr1 = new int[n2];
       for(int i = 0; i < n1; i++){
        arr[i] = sc.nextInt();
       }
       for(int i = 0; i < n2; i++){
        arr1[i] = sc.nextInt();
       }
       for(int i = 0; i < n1; i ++){
        System.out.print(arr[i] + " ");
       }
       for(int i = 0; i < n2; i ++){
        System.out.print(arr1[i] + " ");
       }
    }
}
