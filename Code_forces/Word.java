package Code_forces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int lower_count=0,upper_count=0;
        char[] str=s.toCharArray();
        String lower=s.toLowerCase();
        char[] lower_str=lower.toCharArray();
        String Upper=s.toUpperCase();
        char[] upper_tsr=Upper.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(str[i]==lower_str[i]){
                lower_count++;
            }
            else{
                upper_count++;
            }
        }
        if(lower_count<upper_count){
            System.out.println(Upper);
        }
        else{
            System.out.println(lower);
        }
    }
}
