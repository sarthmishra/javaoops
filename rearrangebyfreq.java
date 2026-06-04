import java.util.*;
public class rearrangebyfreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String,Integer>map = new LinkedHashMap<>();
        String words[] = str.split(" ");
        int n  = words.length;
        for(int i = 0; i < n; i++){
            map.put(words[i],map.getOrDefault(words[i], 0)+1) ;
        }
        List<String> list = new ArrayList<>(map.keySet());
        
        
            
        
    }
}
