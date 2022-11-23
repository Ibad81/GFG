import java.util.Scanner;

public class A318_900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            int j=0,k=0;
            if(i%2==0){
                arr[j+n/2]=i;
                j++;
            }
            else{
                arr[k]=i;
                k++;
            }
        }for (int i : arr) {
            System.out.println(i);
        }
    }
}
