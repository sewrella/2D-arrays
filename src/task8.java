import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {1, 8, 4},
                {7, 2, 6},
                {5, 9, 3}
        };
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter a number: ");
        int threshold = sc.nextInt();
        int count= 0;
        for (int i = 0; i<3; i++){
            for (int j =0; j<3; j++){
                if (matrix[i][j] > threshold){
                    count++;
                }
            }
        }
        System.out.println(" Values greater than "+ threshold + ":"+ count);
    }
}