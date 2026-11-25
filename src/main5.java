import java.util.Scanner;
public class main5 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int[][] ss= new int[2][3];
        for (int i = 0; i < ss.length; i++) {

            for (int j = 0; j < ss[i].length; j++) {

                System.out.print("Enter number: ");
                ss[i][j] = input.nextInt();

    }
}
        System.out.println("Your matrix:");

        for (int i = 0; i < ss.length; i++) {

            for (int j = 0; j < ss[i].length; j++) {

                System.out.print(ss[i][j] + " ");
            }

            System.out.println();
        }

        input.close();
    }
}
