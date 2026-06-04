import java.util.*;
public class removeduplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /*Set<Character>set = new HashSet<>();
        for(int i = 0; i <= s.length() - 1; i++){
            set.add(s.charAt(i));
        }
        //System.out.print(set);
        String ans = "";
        for(char ch : set){
            ans += ch;
        }
        System.out.println(ans); */
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0) +1);
        }
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key);
                break;
            }
        }
    }
}
