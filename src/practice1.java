import java.util.Scanner;

public class practice1{
    public static void main(String[] args){
        int[][] twoD = {
                {67, 67, 67},
                {67, 67, 67},
                {67, 67, 67}
        };
        for (int i=0; i< twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        int sum= 0;
        for (int i= 0; i< twoD.length; i++){
            for (int j=0; j<twoD[i].length; j++){
                sum += twoD[i][j];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < twoD.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < twoD[i].length; j++) {
                rowSum += twoD[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }

    }}