import java.util.*;
public class reversestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed); */
        /*char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] =  temp;
        }
        String reverseds = new String(arr);
        System.out.print(reverseds); */
        /*String rev = " ";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.print(rev); */
        /*Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        String reve = " ";
        while(!stack.isEmpty()){
            reve += stack.pop();
        }
        System.out.print(reve); */
        List<Character>list = new ArrayList<>();
        for(char ch : str.toCharArray()){
            list.add(ch);
        }
        Collections.reverse(list);
        String reverse = " ";
        for (char ch : list){
            reverse += ch;
        }
        System.out.print(reverse);


    }
}
