import java.util.*;
public class frequencyofstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //System.out.print(map);
        /*for(char key : map.keySet()){
            System.out.println(key + " -->" + map.get(key));
        } */
       
    }
}
