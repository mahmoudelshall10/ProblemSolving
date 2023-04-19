import java.util.Scanner;

public class ColorfulStonesSE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String inst = input.nextLine();
        int ans = 0;

        // for(char ch : s.toCharArray())
        // {
        //     for(char chs : inst.toCharArray())
        //     {
        //         if(ch == chs){
        //             ans +=1;
        //         } 
        //     }   
        // }
        // ans +=1;
        
        for (int i = 0; i < inst.length(); i++) {
            if(inst.charAt(i) == s.charAt(ans)){
                ans +=1;
            } 
        }
        ans +=1;
        System.out.println(ans);
}

}
