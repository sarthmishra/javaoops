import java.util.Scanner;
public class practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        //int average = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            //average = sum/n;
            if(arr[i] >= max){
                max = arr[i];
            }
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        double average  = sum/n;
        /*int[] reverese = new int[n];
        int left = 0;
        int right = arr.length;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverese
        }*/
    System.out.println("Sum: "+sum);
    System.out.println("Average: "+average);
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);

    System.out.printf("Reveresed: ");
    for(int i = n-1; i>= 0; i--){
        System.out.print(arr[i]);
    }


    }
}
