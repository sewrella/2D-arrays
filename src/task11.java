
public class task11 {
    public static void main(String[] args) {

        int[][] aa = {
                {1, -8, 4},
                {-7, 2, -6},
                {5, -9, 3}
        };

        System.out.println("Before:");

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {

                if (aa[i][j] < 0) {
                    aa[i][j] = 0;
                }

            }
        }

        System.out.println("After:");

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

