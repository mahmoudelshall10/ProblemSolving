import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num1; i++) {
            // if single digit
            if (i/10 == 0) {
                if( i >= num2 && num3 >= i ){
                    sum +=i;
                }

            } else {
                // if double digits
                int number = i ;
                int aboveTen = 0;

                while(number > 0)
                {
                    int di = number % 10;
                    aboveTen += di; 
                    number /= 10;
                }

                if( aboveTen >= num2 && num3 >= aboveTen ){
                    sum += i;
                }
            }
        }
      
        System.out.println(sum);
    }
}
