import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int search = input.nextInt();
        int flag = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == search) {
                    flag = 1;
                }
            }
        }

        if (flag == 1) {
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }
    }
}
