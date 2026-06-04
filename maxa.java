import java.util.*;
public class maxa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String s = sc.next();
        int max = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i+=L){
            int end = Math.min(i + L, s.length());
            String part = s.substring(i,end);

            for(int j = 0; j < part.length(); j++){
                if(part.charAt(j) == 'a'){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.print(max);
    }
}
