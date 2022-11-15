import java.util.Scanner;

public class Swap_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            
            
            int n=sc.nextInt();
            int arr[]=new int[n];
            int  min =Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
            arr[j]=sc.nextInt();
            
            min=(Math.min(min,arr[j]));
            }
            if(min==arr[0]){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}
