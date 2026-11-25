import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int []oneD = {10,20,39};
        int[][] twoD = {
                {10,40,50},
                {70,4,42},
                {12,33,56}
        };
        System.out.println(twoD[1][2]);
        System.out.println(twoD[2][1]);

        for (int i=0; i< twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();

        }
    }
}