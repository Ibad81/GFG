package Code_forces;

import java.util.Scanner;

public class Calculating_Function {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long num=sc.nextLong();
    
    long ans;
    if(num%2==0){
        ans=num/2;
    }
    else ans=(-1)*(num/2+1  )  ;
    System.out.println(ans);
}
}
