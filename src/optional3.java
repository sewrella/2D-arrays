public class optional3 {
        public static void main(String[] args) {

            int[][] aa = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] bb = {
                    {10, 20, 30},
                    {40, 50, 60}
            };

            int[][] cc = new int[2][3];

            for (int i = 0; i < aa.length; i++) {
                for (int j = 0; j < aa[i].length; j++) {
                    cc[i][j] = aa[i][j] + bb[i][j];
                }
            }

            System.out.println("Third matrix:");

            for (int i = 0; i < cc.length; i++) {
                for (int j = 0; j < cc[i].length; j++) {
                    System.out.print(cc[i][j] + " ");
                }
                System.out.println();
            }
        }


}
