import java.util.Scanner;

public class Factorial {
    public void getFactorial()
    {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int y = 1;
        for (int i = num; i > 0 ; i--) {
            y = i*y;
        }
        if(y%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

     // public static int fact(int x)
    // {
    //     if(x < 1){
    //         return 1;
    //     }else{
    //         return x * fact(x-1);
    //     }
    // }
}
