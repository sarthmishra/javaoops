import java.io.*;
public class Filehandling {
    public static void main(String[] args)throws Exception{
        File f  = new File("/Users/sarthmishra/Desktop/javaoops");
        System.out.println(f.isDirectory());
        String[] str = f.list();
        for(String s  : str){
            System.out.println(s);
        }
    }
}
