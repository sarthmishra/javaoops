import java.util.*;
public class twsosum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int Target = sc.nextInt();
        Map<Integer,Integer>map = new HashMap<>();
        for(int i = 0; i < n; i++){
            //map.put(arr[i],i);
            int diff = Target - arr[i];
            if(map.containsKey(diff)){
                System.out.printf("The number is %d and the diff is %d",arr[i],diff);
            }else{
                map.put(arr[i],i);
            }
        }
        
        
        
    }
}
