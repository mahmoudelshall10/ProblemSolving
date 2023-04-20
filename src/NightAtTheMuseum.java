import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabetic[] = {'a','b','c','d','e','f','g','h',
                                'i','j','k','l','m','n','o','p','q',
                                'r','s','t','u','v','w','x','y','z'};
        String word = input.nextLine();
        // System.out.println(word);
        int ans = 0;
        int pointer = 0;

        for (int j = 0; j < word.length(); j++) {
            for (int i = 0; i < alphabetic.length; i++) {

                    if(word.charAt(j) == alphabetic[i])
                    {
                        // System.out.println("The i : "+i);

                        if((Math.abs(i-pointer)) > 13)
                        {
                            ans += (26%(Math.abs(i-pointer)));
                            // System.out.println("Ans > 13 : " + ans);
                        }else{
                            ans += (Math.abs(i-pointer));
                            // System.out.println("Ans < 13 : " + ans);
                        }
                        pointer = i;
                    }
            }
        }
        System.out.println(ans);
    }
}
