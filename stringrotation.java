import java.util.*;
public class stringrotation {
    public static void main(String[] args){
        String str1 = "ABCD";
        String str2 = "BCDA";
        /*if(str1.length() != str2.length()){
            System.out.print("not a rotation");
        }
        String temp = str1 + str2;
        if(temp.contains(str2)){
            System.out.print("Rotation");
        }else{
            System.out.print("not a rotation");
        } */
       boolean flag = false;
       for(int i = 0; i < str1.length(); i++){
            str1 = str1.substring(1)+str2.substring(0);
                if(str1.equals(str2)){
                    flag = true;
                    break;
                }
            }
            if(flag)
            System.out.println("Rotation");
            else
            System.out.println("Not Rotation");
    }
}
