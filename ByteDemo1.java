
import java.io.*;
public class ByteDemo1 {
    public static void main(String[] args)throws Exception{
       
        ByteArrayOutputStream Bos = new ByteArrayOutputStream(20);
        Bos.write('a');
        Bos.write('b');
        Bos.write('c');
        Bos.write('d');
       /* byte[] b = Bos.toByteArray();
        for(byte x : b){
            System.out.println((char)x);
        } */
        Bos.writeTo(new FileOutputStream("/Users/sarthmishra/Desktop/javaoops/myfile2.txt"));

        Bos.close();
    }
}
