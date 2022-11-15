import java.util.Scanner;

public class Water_consumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num=sc.nextInt();
            if(num>=2000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}
