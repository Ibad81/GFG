package Code_forces;
import java.util.Scanner;
public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int no=sc.nextInt();
        for(int i=0;i<no;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+2<=b){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
