
public class task10 {
    public static void main(String[] args) {
        int[][] aa = {
                {1, 8, 4},
                {7, 2, 6},
                {5, 9, 3}
        };
        System.out.println("Matrix: ");
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < aa.length; i++) {
            sum += aa[i][i];
        }
        System.out.println("Sum of diagonal: "+ sum);
        }
}