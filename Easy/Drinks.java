package Easy;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        double sum=0;
        for (int i = 0; i <num; i++) {
            
            sum+=sc.nextDouble();
        }
        double ans= ((sum)/num);
        System.out.println(ans);
    }
}
