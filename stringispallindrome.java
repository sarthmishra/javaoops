import java.util.*;
public class stringispallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        /*while(left <= right){
            if(str.charAt(left++) != str.charAt(right--)){
                System.out.println("String is not a pallindrome");
                return;
            }
        }
                System.out.println("String is a pallindrome"); */
                boolean ispallindrome = true;
                while(left <= right){
                    if(str.charAt(left++) != str.charAt(right--)){
                        ispallindrome = false;
                        break;
                    }
                }
                if(ispallindrome){
                    System.out.print("String is a pallindrome");
                }else{
                    System.out.println("String is not a pallindrome");
                }
    }
}
