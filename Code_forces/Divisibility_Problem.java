package Code_forces;
import java.util.Scanner;
public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int count[]=new int[n];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            System.out.println(a%b==0?0:b-a%b);
        }
        
        
    }
}
