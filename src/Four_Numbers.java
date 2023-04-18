import java.util.Scanner;

public class Four_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 4;
        long multi = 1;
        for (int i = 0; i < size; i++) {
            int num = input.nextInt();
            multi *= num;
        }
        System.out.print(multi);

    }
}