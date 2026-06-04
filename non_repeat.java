import java.util.*;
public class non_repeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(char key : map.keySet()){
        if(map.get(key) == 1){
        System.out.println(key);
        break;
    }
}
    }
}
