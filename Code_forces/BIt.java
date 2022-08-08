package Code_forces;

import java.util.Scanner;
 
public class BIt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="X++";
        String b="++X";
        int X=0;
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(int j=0;j<n;j++){
            if(str[j].equals(a)||str[j].equals(b)){
                X++;
            }
            else{
                --X;
            }
        }
        System.out.println(X);
    }
}
