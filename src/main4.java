public class main4 {
    public static void main (String[]args){
        int[][] dd ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < dd[i].length; j++) {

                if (dd[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
                System.out.println("Even numbers: "+ evenCount);
                System.out.println("Odd numbers: "+ oddCount);



    }
}
