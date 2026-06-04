import java.util.*;
public class substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        /*for(int i = 0; i < n; i++){
            for(int j = i;j <= n; j++){
                System.out.println(str.substring(i,j));
            }
        } */
        /*for(int i = 0; i < str.length() - 1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < str.length() -1; j++){
                sb.append(str.charAt(j));
                System.out.print(sb);
            }
        } */
       char[] arr = str.toCharArray();
       int m = arr.length;
       for(int i = 0; i < m; i++){
            String sbs = " ";
            for(int j = i; j < m; j++){
                sbs += arr[j];
                System.out.print(sbs);
            }
       }
    }
}
