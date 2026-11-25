public class optional1 {

        public static void main(String[] args) {

            int[][] aa = {
                    {10, 20, 30, 40},
                    {50, 10, 20, 30},
                    {15, 25, 35, 45}
            };

            int maxSum = 0;
            int maxRow = 0;

            for (int i = 0; i < aa.length; i++) {

                int sum = 0;

                for (int j = 0; j < aa[i].length; j++) {
                    sum += aa[i][j];
                }

                System.out.println("Row " + (i + 1) + " sum: " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = i;
                }
            }

            System.out.println("Largest sum: " + maxSum);
            System.out.println("Row with largest sum: " + (maxRow + 1));
        }
    }


