public class revise {
    /*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int key = sc.nextInt();
        if(key <= 0){
            System.out.print("INVALID OUTPUT");
            return;
        }
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            
            char ch = str.charAt(i);
            
            if(Character.isLowerCase(ch)){
                char c = (char)((ch - 'a' + key) % 26 + 'a');
                ans.append(c);
            }else if(Character.isUpperCase(ch)){
                char c = (char)((ch - 'A' + key) % 26 + 'A');
                ans.append(c);
            }else if(Character.isDigit(ch)){
                char c = (char)((ch - '0' + key) % 10 + '0');
                ans.append(c);
            }else{
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
} */
}/*import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int R = sc.nextInt();

        int[] arr = new int[S];

        for(int i = 0; i < S; i++){
            arr[i] = sc.nextInt();
        }

        int[][] arr1 = new int[R][2];

        for(int i = 0; i < R; i++){
            for(int j = 0; j < 2; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < R; i++){

            int count = 0;

            int low = arr1[i][0];
            int high = arr1[i][1];

            for(int j = 0; j < S; j++){

                if(arr[j] >= low && arr[j] <= high){
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
} */
