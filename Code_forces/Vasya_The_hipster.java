package Code_forces;

import java.util.Scanner;

public class Vasya_The_hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int fis=Math.min(n1,n2);
        if(n1>n2){
            System.out.println(fis+" "+((n1-n2)/2));
        }
        else{
            System.out.println(fis+" "+(n2-n1)/2);
        }
    }
}
