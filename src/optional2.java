public class optional2 {
        public static void main(String[] args) {

            int[][] aa = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] bb = new int[3][2];

            System.out.println("Original matrix:");

            for (int i = 0; i < aa.length; i++) {
                for (int j = 0; j < aa[i].length; j++) {
                    System.out.print(aa[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < aa.length; i++) {
                for (int j = 0; j < aa[i].length; j++) {
                    bb[j][i] = aa[i][j];
                }
            }

            System.out.println("New matrix:");

            for (int i = 0; i < bb.length; i++) {
                for (int j = 0; j < bb[i].length; j++) {
                    System.out.print(bb[i][j] + " ");
                }
                System.out.println();
            }
        }

}
