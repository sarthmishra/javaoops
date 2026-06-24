import java.io.*;
public class FileExample {
    public static void main(String[] args){
        //object of file outputstream
        try{
        FileOutputStream fos  = new FileOutputStream("/Users/sarthmishra/Desktop/myfile.txt");
        //object is created. inside the try block

        String str = "This is my Program";
            //fos.write(str.getBytes());//getbytes return array of bytes //string is converted into an array
            byte[] b = str.getBytes();
            /*for( byte x : b){
                fos.write(x);
            } */
           //fos.write(b,8,str.length()-8);
           fos.write(b);


            fos.close();
        }
        catch(FileNotFoundException f){
            System.out.print(f);
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
