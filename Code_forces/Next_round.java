package Code_forces;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Next_round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int[] Arr =new int[n];
        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        int key =Arr[k-1];
        for(int j=0;j<n;j++){
                    if(Arr[j]>=key && Arr[j]>0){
                
                count ++;
            }
        }
        System.out.println(count);
    }
}
