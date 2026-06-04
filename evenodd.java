import java.util.*;

public class evenodd{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0? "even":"odd");
        }
    }
}