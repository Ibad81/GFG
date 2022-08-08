package Code_forces;

import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vas,pre,roh;
        int count=0;
        int n=sc.nextInt();
        while(n-->0){
            vas=sc.nextInt();
            pre=sc.nextInt();
            roh=sc.nextInt();
            int sum=vas+pre+roh;
            
            if(sum<=2){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
