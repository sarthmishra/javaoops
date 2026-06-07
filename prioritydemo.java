import java.util.*;
public class prioritydemo {
    public static void main(String[] args){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(9);
        System.out.println(pq.peek());
        pq.forEach((x) -> System.out.println(x));
        pq.poll();
        System.out.println("After Deletion: ");
        pq.forEach((c) -> System.out.println(c));
    }
}
/*class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityDemo 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());
         */