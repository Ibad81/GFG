package Code_forces;
import java.util.Arrays;
import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int [n];
        int temp=0;
        int [] var=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            // System.out.println (arr1[i]+""+arr2[i] );
            // System.out.println(arr2[i]);
            temp=((temp-arr1[i])+arr2[i]);
            var[i]=temp;
            
            

            
        }
        Arrays.sort(var);
        System.out.println(var[n-1]);
        

    }
}
