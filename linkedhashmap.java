import java.util.LinkedHashMap.*;
import java.util.*;
public class linkedhashmap {
    public static void main(String[] args){
        //LinkedHashMap<Integer,String> hm= new LinkedHashMap<>(5,.75f,true)
        LinkedHashMap<Integer,String> hm= new LinkedHashMap<>(5){
            protected boolean removeEldestEntry(Map.Entry e){
                return size() > 5;
            }
        };
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");

        String s = hm.get(5);
        s = hm.get(4);
        s= hm.get(1);
        hm.put(6,"F");
        hm.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
