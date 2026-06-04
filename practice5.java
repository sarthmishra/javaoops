import java.util.*;
public class practice5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int T = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //Without duplicates
        int[] copy = arr.clone();
        Set<Integer>set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(copy[i]);
        }
        System.out.println(set);
        Set<Integer> seen = new LinkedHashSet<>();
        for (int x : arr) seen.add(x);

        System.out.print("Without duplicates: ");
        boolean first = true;
        for (int x : seen) {
            if (!first) System.out.print(" ");
            System.out.print(x);
            first = false;
        }
        System.out.println();
        /* 
        
        //All pairs with sum 10
        int count = 0;
         System.out.print("All pairs with sum " + T + ": ");
        for(int i = 0; i < n; i++){
            for(int j = i+1; j< n; j++){
                if(arr[i] + arr[j] == T){
                    System.out.print(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Total pairs = " + count);

        //kadane's algorithm
        int currsum = arr[0];
        int maxsum = arr[0];
        for(int i = 1; i < n; i++){
            currsum = Math.max(arr[i],currsum + arr[i]);
            maxsum = Math.max(maxsum,currsum);
        }
        System.out.println("The max subarray sum is "+maxsum);*/

    }
}
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // --- Without duplicates ---
        Set<Integer> seen = new LinkedHashSet<>();
        for (int x : arr) seen.add(x);

        System.out.print("Without duplicates: ");
        boolean first = true;
        for (int x : seen) {
            if (!first) System.out.print(" ");
            System.out.print(x);
            first = false;
        }
        System.out.println();

        // --- All pairs with sum T ---
        int count = 0;
        System.out.print("All pairs with sum " + T + ": ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == T) {
                    if (count > 0) System.out.print(" ");
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Pair count: " + count);

        // --- Kadane's algorithm ---
        int currSum = arr[0];
        int maxSum  = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum  = Math.max(maxSum, currSum);
        }
        System.out.println("Max subarray sum: " + maxSum);

        sc.close();
    }
} */