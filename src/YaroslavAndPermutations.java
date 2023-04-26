import java.util.Scanner;
import java.util.Arrays;  

public class YaroslavAndPermutations{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        int res = 0;


        
        
        for (int i = 0; i < arr.length; arr[i++]=input.nextInt()) {}
        
        for (int i = 0; i < arr.length; i++) 
        {
            int swapping = 0;
            for (int j = 0; j < arr.length; j++) 
            {
                if(arr[i] == arr[j])
                    {
                        swapping++;
                    }

                    if(swapping > res)
                    {
                        res = swapping;
                    }
            }
             
        }

        // [1,2,3,4,5,1,1,1,2,5] even
        // [1,2,3,4,5,1,1,1,2] odd
        
        if (size % 2 == 0) {   //even

            if(res <= size / 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        } else { //odd

            if(res <= (size/2) + 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }

        // for (int i = 0; i < arr.length; i++) {
        //         for (int j = i + 1; j < arr.length; j++) {
        //         int p = 0;
        //         if(arr[j] == arr[i])
        //         {
        //             p = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = p;
        //             swapping +=1;
        //         }
        //     }
        // }
        
        // Arrays.sort(arr);
        // System.out.println(swapping);
        // System.out.println(Arrays.toString(arr));


        // if (swapping == 0 || size == 1) {
        //     System.out.println("YES");
            
        // } else {
        //     System.out.println("NO");
        // }

    }
}