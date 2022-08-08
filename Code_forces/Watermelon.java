package Code_forces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        String res=(n<=2 ||n%2!=0)?"No":"Yes";
        System.out.println(res);
    }
}
