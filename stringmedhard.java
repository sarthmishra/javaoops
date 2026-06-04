import java.util.*;
public class stringmedhard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        HashMap<Character,Integer>map = new LinkedHashMap<>();
        
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("First Non Repeating: ");
        boolean found = false;
        for(char c : arr){
            if(map.get(c) == 1){
                System.out.print(c);
                found = true;
                break;
            }
        }
        if(!found) System.out.print("Not found");

        char mostfrreq = arr[0];
        Integer maxfreq = 0;
        for(Map.Entry<Character,Integer> ch : map.entrySet()){
            if(ch.getValue() > maxfreq){
                maxfreq = ch.getValue();
                mostfrreq = ch.getKey();
            }
        }
        System.out.println("Most frequent: " + mostfrreq);
        System.out.println("Distinct characters: " + map.size());

    }
}
