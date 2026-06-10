import java.util.*;
public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(10);
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(6);
        lhs.add(5);
        //lhs.forEach(System.out::println);

        Iterator<Integer> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
