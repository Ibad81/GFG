package Code_forces;

import java.util.Arrays;
import java.util.Scanner;
public class Remove_Smallest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = n; i > 0; i--) {
            
        
            int n1=sc.nextInt();
            int [] arr=new int[n1];
            
            for (int j = 0; j < n1; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            String res="YES";
            for(int j=1;j<n1;j++){
                if(arr[j]-arr[j-1]>1){
                    res="NO";
                    break;
                }
            }
            System.out.println(res);
            
        }

    }
}
