import java.util.*;
public class reversingarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k  =sc.nextInt();
        int m = n - k;
        int left = 0;
        int right = n- 1;
        while(left <= right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        int left1 = 0;
        int right1 = m-1;
        while(left1 <= right1){
            int temp = arr[left1];
            arr[left1++] = arr[right1];
            arr[right1--] = temp;
        }
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
