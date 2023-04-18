import java.util.Scanner;

public class SummationFrom1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long size = input.nextLong();
        long sum = 0;
        sum = (size*(size+1)) / 2;
        // for (long i = 1; i < size+1; i++) {
        //     sum += i;
        // }
        System.out.print(sum);

    }
}
