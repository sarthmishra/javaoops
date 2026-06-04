import java.util.*;
public class arrayques {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];    int[] arr2 = new int[n];
    for(int i = 0; i < n; i++){arr1[i] = sc.nextInt();}
    for(int i = 0; i < n; i++){arr2[i] = sc.nextInt();}

        Set<Integer>set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr2[i]);
        }
        for(int i = 0; i < n; i++){
            if(!set.contains(arr1[i])){
                System.out.print(arr1[i] + " ");
            }
        }
        Set<Integer>seto = new HashSet<>();
        for(int i = 0; i < arr1.length;i ++){
            seto.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if(seto.contains(arr2[i])){
                System.out.println(arr2[i] + " ");
            }
        }

        
        //frequency
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(
                "Element " + entry.getKey() +
                " has frequency " + entry.getValue()
            );
        }


        //second min
    int[] copy = arr2.clone();
    int Fmin = Integer.MAX_VALUE;
    int Smin = Integer.MAX_VALUE;
    for(int i = 0; i < copy.length; i++){
        if(Fmin > copy[i]){
            Smin = Fmin;
            Fmin = copy[i];
        }else if(Fmin < copy[i] && Smin > copy[i]){
            Smin = copy[i];
            }
        }
        System.out.println("Second minimum is "+Smin);

    } 
}
