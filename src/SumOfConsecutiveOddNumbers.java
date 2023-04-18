import java.util.Scanner;
import java.util.Arrays;  

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int col = 2;
        int[][] arrNums = new int[size][col];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                arrNums[i][j] = input.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arrNums)); 



        // for (int i = 0; i < arrNums.length; i++) {
        //     for (int j = 0; j < col; j++) {
        //         // for (int j2 = arrNums[i][j]+1; j2 < arrNums[i][j] ; j2++) {
        //             // if(arrNums[i][j] % 2 != 0){
        //                 // sum += arrNums[i][j];
        //                 // System.out.println(Arrays.toString(arrNums[i])); 
        //             // }
        //         // }
        //         }
        //     }

        // System.out.println(Arrays.toString(arrNums[i])); 
        // System.out.println(Arrays.toString(arr)); 
            for (int i = 0; i < arrNums.length; i++) {
                int sum = 0;
                int arr[] = arrNums[i]; 

                int min = arr[0];
                int max = arr[0];


                for (int j = 0 ; j < arr.length ; j++) {
                        
                if (arr[j] < min) {
                    min = arr[j];
                }

                if (arr[j] > max) {
                    max = arr[j];
                }


                }
                for (int t = min+1 ; t < max ; t++)
                {
                    if(t % 2 != 0)
                    {
                    sum += t;
                    }
                }
                // System.out.println(); 
                // System.out.println(min+" min "); 
                // System.out.println(max+" max "+"\n\n"); 
 
                System.out.println(sum); 
            }

    }
}
