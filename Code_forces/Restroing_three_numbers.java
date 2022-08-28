package Code_forces;

import java.util.Scanner;
import java.util.Arrays;
public class Restroing_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // System.out.println(arr[3]);
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[3]-arr[j]+" ");
        }
        


    }
}
