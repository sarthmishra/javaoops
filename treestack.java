import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class treestack {
    public static void main(String[] args){
        TreeMap<Integer,String>TM = new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
        TM.put(4,"D");
        TM.put(5,"C");
        Entry<Integer,String>e = TM.firstEntry();
        System.out.print(e.getKey() +" + "+ e.getValue());
        System.out.print(TM);
        System.out.println(TM.ceilingEntry(5).getValue());
        System.out.print(TM.get(3));
    }
}
