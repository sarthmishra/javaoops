import java.io.*;
public class BufferedDemo {
    public static void main(String[] args)throws Exception{
        FileInputStream fis  = new FileInputStream("/Users/sarthmishra/Desktop/myfile.txt");
        BufferedInputStream bis  = new BufferedInputStream(fis);
        int x;
        /*while((x = bis.read()) != -1){
            System.out.println((char)x);
        } */

       // System.out.println("file is " + fis.markSupported());
        //System.out.println("Buffer is " + bis.markSupported());

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
       // System.out.println("String "+bis.readLine());

    }
}
