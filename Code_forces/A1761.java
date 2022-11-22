import java.util.Scanner;

public class A1761 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), a=sc.nextInt(), b=sc.nextInt();

            System.out.println((a==n&& b==n) || a+b<n-1?"Yes":"No");
        }
    }
}
