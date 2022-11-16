import java.util.Scanner;

public class kevin_and_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int term=sc.nextInt();
        for (int i = 0; i < term; i++) {
            int n=sc.nextInt();
            int a=n/2+1,b=1;
            for(int j=1;j<=n/2;j++){
                System.out.print(a+" "+b+" ");
                a++;b++;
                  
            }
              if(n%2!=0)
              System.out.print(a);
                System.out.println();
            
        }
    }
}
