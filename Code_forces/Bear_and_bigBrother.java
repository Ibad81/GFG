package Code_forces;

import java.util.Scanner;

public class Bear_and_bigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;

        int fir_num=sc.nextInt();
        int sec_num=sc.nextInt();
        for (i = 0; fir_num<= sec_num; i++) {
            fir_num=fir_num*4;
            sec_num=sec_num*3;
            
            
        }
        System.out.println(i);
    }
}
