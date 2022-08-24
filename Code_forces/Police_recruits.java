package Code_forces;
import java.util.Scanner;
public class Police_recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x=0,count=0;
        
        while(num>0) {
            x=x+sc.nextInt();
            if(x<0){
                count++;
                x=0;
                
            }
            num--;
        }
        System.out.println(count);
    }
}
