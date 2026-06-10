import java.util.Deque;
import java.util.ArrayDeque;
public class stackdeque {
    public static void main(String[] args){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(4);
        dq.push(5);
        dq.push(6);
        
        System.out.println(dq.peek());
        System.out.println(dq.pop());
    }
}
