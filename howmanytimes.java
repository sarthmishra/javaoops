import java.util.*;
public class howmanytimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        HashMap<String,Integer>map = new LinkedHashMap<>();
        String words[] = str.split(" ");
        for(int i = 0; i < words.length; i++){
            map.put(words[i],map.getOrDefault(words[i], 0) +1);
        }
        for(String key : map.keySet()){
            if(map.get(key) >= 2){
                System.out.println(key + "-->" + map.get(key));
            }
        }
    }
}
/*import java.util.*;
public class  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

    }
}
 */