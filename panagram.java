import java.util.*;
public class panagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(c >= 'a' && c <= 'z')
                set.add(c);
        }
        System.out.print(set);
        if(set.size() == 26){
            System.out.println("Panagram");
        }else{
            System.out.print("Not a Panagram");
        }
    }
}
