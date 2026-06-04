import java.util.*;
public class Leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            boolean isleader = true;
            for(int j = i+1; j < n; j++){
                if(arr[i] < arr[j]){
                    isleader = false;
                    break;
                }
            }
            if(isleader)list.add(arr[i]);
        }
        System.out.print(list);
    }
    
}
