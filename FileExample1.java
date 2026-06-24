//import java.util.*;
import java.io.*;
public class FileExample1 {
    public static void main(String[] args)throws Exception {
        try (FileInputStream fis  = new FileInputStream("/Users/sarthmishra/Desktop/myfile.txt")) {
            /*byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.print(str); */
            int x ;
           /* do{
                x = fis.read();//reads code of byte and keeps it in integer variable x
                if( x != -1)//because otherwise it is printing -1 and then checks it is -1 and then stops
                System.out.print((char)x);//typecast as a character

            }while(x != -1); */
            while((x = fis.read()) != -1){
                System.out.print((char)x);
            }
            



        }
    }
}