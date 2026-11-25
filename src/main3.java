public class main3 {
    public static void main(String[] args) {

        int[][] twoD = {
                {10, 40, 50,89},
                {70, 4, 42, 34},
                {12, 33, 56,43}
        };

        for (int i = 0; i < twoD.length; i++) {

            int max = twoD[i][0];

            for (int j = 0; j < twoD[i].length; j++) {

                if (twoD[i][j] > max) {
                    max = twoD[i][j];
                }
            }

            System.out.println("Max of row " + (i + 1) + ": " + max);
        }
        for (int i = 0; i < twoD.length; i++) {
            int min = twoD[i][0];
            for (int j = 0; j < twoD[i].length; j++) {
                if (twoD[i][j] < min) {
                    min = twoD[i][j];
                }
            }
            System.out.println("Min of row " + (i + 1) + ": " + min);

        }
    }
}