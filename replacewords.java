import java.util.*;
public class replacewords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        int n = words.length;

        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                set.add(c);
            }
            result.append(set.size());
        }
        
    }
}







/*HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        } */