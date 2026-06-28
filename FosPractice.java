import java.io.*;

public class FosPractice {
    public static void main(String[] args)throws Exception{
       // FileOutputStream fos = new FileOutputStream("myfile3.txt");
      //  String str2 = "This is a demo Program";
       // fos.write(str2.getBytes()); 
     //   System.out.println("File created successfully!");
     //   fos.close();
     FileInputStream fis  = new FileInputStream("myfile3.txt");
     //System.out.print(fis.available());//returns the number of bytes available 
     byte[] b = new byte[fis.available()];// create empty array
     fis.read(b);// fill it with file content
     String ss = new String(b).trim();// bytes → String
     System.out.print(ss);



    }
}
