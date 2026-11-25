import java.util.Scanner;
public class task9 {
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
        System.out.println("Enter a number to find: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (matrix[i][j] == target) {
                    System.out.println("Found at row "+ i + ", column"+j);
                    found = true;
                    break;

                }
            }
        }
        if (!found){
            System.out.println("Not found!");
        }
        sc.close();
    }
}