import java.util.*;;
public class properties {

    public static void main(String[] args){
        Properties p = new Properties();

        p.setProperty("Brand", "Apple");
        p.setProperty("chip", "M4");
        p.setProperty("year", "2025");
        p.setProperty("OS", "Mac");

        System.out.println(p);
    }
}
