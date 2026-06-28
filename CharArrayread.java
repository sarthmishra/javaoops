import java.io.*;
public class CharArrayread {
    //Exactly like ByteArrayInputStream
    public static void main(String[] args)throws Exception {
        char[] c= {'a','b','c','d','e','f','g','h','i'};
        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while((x = cr.read()) != -1)
        {
            System.out.println((char)x);
        }

    }
}
