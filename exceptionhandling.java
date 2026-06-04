import java.util.*;
public class exceptionhandling {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){

        } */
        int[] arr1 = {30,20,10,40,0};
        try{
            int c = arr1[3]/arr1[4];
            System.out.print(c);

            try{
                System.out.println(arr1[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Index is Invalid");
            }

        }
        catch(ArithmeticException e){
            
            System.out.println("Denominator should not be 0");
        
        }
        System.out.println("Bye");
    }
}
