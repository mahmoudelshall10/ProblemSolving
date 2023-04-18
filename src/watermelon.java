import java.util.Scanner;

public class watermelon {

    public void weight()
    {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            if(x%2 == 0 && x >= 4 && x <=100)
                 System.out.println("YES");
             else
                 System.out.println("NO");
    }
}
