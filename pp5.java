import java.util.*;
public class pp5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();System.out.print("Enter the length of array "+n);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){arr[i] = sc.nextInt();}
        int k = sc.nextInt();System.out.print("Enter the value of k "+k);
        
            
        
        int[] copy = arr.clone();
        //bubble sort
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n- i - 1; j++){
                if(copy[j] > copy[j+1]){
                    int temp = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {System.out.println("sorted array is"+copy[i]);}
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = arr[(i+k)%n];
        }
        for(int i = 0; i < n; i++){System.out.println(result[i] + "rotated array is ");}
    

        //max,min,Second max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int Mmax = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i = 0; i <= n-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > Mmax){
                Smax = Mmax;
                Mmax = arr[i];
            }
            else if (arr[i] > Smax && arr[i] != Mmax){
                Smax = arr[i];
            }
        }
        System.out.println("max is "+max);
        System.out.println("max is "+min);
        System.out.println("Second max is "+Smax);
    }
}
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();                   // same line as n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // --- Bubble Sort on a copy ---
        int[] copy = arr.clone();
        for (int i = 0; i < n - 1; i++) {      // n-1 passes, not n
            for (int j = 0; j < n - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        // --- Max, Min, SecondMax on original ---
        int max = arr[0], min = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { secondMax = max; max = arr[i]; }
            else if (arr[i] > secondMax && arr[i] != max) secondMax = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max + "  Min: " + min + "  SecondMax: " + secondMax);

        // --- Left rotation by K ---
        int[] result = new int[n];
        for (int i = 0; i < n; i++) result[i] = arr[(i + k) % n];
        System.out.print("Left rotated by " + k + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        // --- Linear Search ---
        int[] targets = {5, 7};
        for (int target : targets) {
            int foundAt = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) { foundAt = i; break; }
            }
            if (foundAt == -1) System.out.println("Search " + target + ": Not found");
            else System.out.println("Search " + target + ": Found at index " + foundAt);
        }

        sc.close();
    }
} */
