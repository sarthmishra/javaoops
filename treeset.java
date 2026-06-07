import java.util.*;
public class treeset {
    public static void main(String[] args){
        TreeSet<Integer>ts = new TreeSet<>(List.of(10,20,50,30,40));
        ts.add(55);
        ts.ceiling(50);
        System.out.print(ts);
    }
}
