package Code_forces;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character> hs=new HashSet<>();
        int num =sc.nextInt();
        String str=sc.next();
        int temp=0;
        String str_lower=str.toUpperCase();
        for (int i = 0; i < num; i++) {
            hs.add(str_lower.charAt(i));
        }
        // System.out.println(hs.size());
        if(hs.size()==26){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
