package Code_forces;

import java.util.Scanner;

public class Short_substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
            char[] cha=new char[str.length()];
            for(int j=0;j<str.length();j++){
                cha[j]=str.charAt(j);
            }
            System.out.print(cha[0]);
            System.out.print(cha[1]);
            for (int j = 3; j < cha.length; j=j+2) {
                System.out.print(cha[j]);
            }
            System.out.println();
        }
    }
}
