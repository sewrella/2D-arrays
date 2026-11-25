import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {1,5,9},
                {4,7,2},
                {8,3,6}
        };
        System.out.println("Matrix: ");
        for (int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

            }
            System.out.println("Column sums: ");
            for (int col = 0; col < 3; col++) {
                int sum = 0;
                for (int row = 0; row < 3; row++) {
                    sum += (matrix[row][col]);
                }
                System.out.println("Column " + col + " sum = " + sum);

            }

    }
}

