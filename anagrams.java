import java.util.*;
public class anagrams {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";

        /*str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.print("Not an anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("String is an anagram");
        }else{
            System.out.println("String is not an anagram");
        } */
       /*public class Main {

    public static void permute(String str, int l, int r) {

        if(l == r) {
            System.out.println(str);
            return;
        }

        for(int i = l; i <= r; i++) {

            str = swap(str, l, i);

            permute(str, l + 1, r);

            // backtracking
            str = swap(str, l, i);
        }
    }

    public static String swap(String str, int i, int j) {

        char[] arr = str.toCharArray();

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        String str = "ABC";

        permute(str, 0, str.length() - 1);
    }
} */
    }
}
/*REVISE
import java.util.*;

public class Main {
    public static boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 3; i <= n; i++) {
            if (isprime(i)) {
                // Check if i can be expressed as sum of consecutive primes starting from 2
                int sum = 0;
                for (int j = 2; j < i; j++) {
                    if (isprime(j)) {
                        sum += j;
                        if (sum == i) {
                            count++;
                            break;
                        }
                        if (sum > i) break;
                    }
                }
            }
        }

        System.out.println(count);
    }
} */
/*import java.util.*;

public class Main {
    public static boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 3; i <= n; i++) {
            if (isprime(i)) {
                // Check if i can be expressed as sum of consecutive primes starting from 2
                int sum = 0;
                for (int j = 2; j < i; j++) {
                    if (isprime(j)) {
                        sum += j;
                        if (sum == i) {
                            count++;
                            break;
                        }
                        if (sum > i) break;
                    }
                }
            }
        }

        System.out.println(count);
    }
} */