import java.util.*;
public class mostfrequent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer>map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        /*int mostfreq = 0;
        int max = Collections.max(map.values());
        for(char c : s.toCharArray()){
            if(map.get(c) == max)
                System.out.print(c);
                break;
                
            } */
        
    }
}
