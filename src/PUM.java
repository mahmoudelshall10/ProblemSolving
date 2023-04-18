import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int i = 1; i <= size*4; i++) {
            if (i % 4 == 0) {
                System.out.print("PUM");
                System.out.println();
            } else {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
