public class task12 {
    public static void main(String[] args) {

        int[][] scores = {
                {80, 90, 75, 85},
                {70, 65, 90, 80},
                {95, 85, 100, 90}
        };

        int max = scores[0][0];
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                total += scores[i][j];

                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }

            double average = sum / 4.0;

            System.out.println("Student " + (i + 1) +
                    " average: " + average);
        }

        double overallAverage = total / 12.0;

        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAverage);
    }
}

