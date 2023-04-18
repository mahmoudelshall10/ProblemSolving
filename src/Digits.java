import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for (int i=0; i<size; i++) {
            int enterDigit = input.nextInt();
            if (enterDigit == 0) {
                System.out.println(0);
                continue;
            }
            while(enterDigit != 0)
            {
                int digit = enterDigit % 10;
                System.out.print(digit + " ");
                enterDigit /= 10;
            }
            System.out.println();
        }
        
    }
}
