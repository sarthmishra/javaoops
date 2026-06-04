import java.util.*;
public class fizz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0){System.out.println("FizzBuzz");}
            else if (arr[i] % 3 == 0){System.out.println("Fizz");}
            else if (arr[i] % 5 == 0){System.out.println("Buzz");}
            else{System.out.println(arr[i]);}
            if(arr[i] % 2 == 0){even++;}
            else{odd++;}
            
        }
        
        
            System.out.println("Odd count is: "+odd);
            System.out.println("Even count is: "+even);
    }
}
