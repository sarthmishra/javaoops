import java.io.*;
public class ByteDemo {
    public static void main(String[] args)throws Exception{
        byte[] b= {'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        /*first input type 
        int x;
        while((x=bis.read()) != -1){//from bis read data and store it in x//reading one byte at a time
            System.out.print((char)x);
        } */

            String str = new String(bis.readAllBytes());
            System.out.println(str);
            System.out.println(bis.markSupported());
        bis.close();

    }
}
