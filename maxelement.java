import java.util.*;
public class maxelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxsum = 0;
        for(int i = 0; i< r; i++){
            int rowsum = 0;
            for(int j = 0; j < c; j++){
                rowsum += matrix[i][j];
            }
            maxsum = Math.max(maxsum, rowsum);
        }
        System.out.println("The max element in row is "+maxsum);
        int maxsum1 = 0;
        for(int i = 0; i< r; i++){
            int colsum = 0;
            for(int j = 0; j < c; j++){
                colsum += matrix[j][i];
            }
            maxsum1 = Math.max(maxsum1, colsum);
        }
        System.out.println("The max element in column is "+maxsum1);
        int largestelement = maxsum + maxsum1;
        System.out.println("The largest ELement is: "+largestelement);

    }
}
