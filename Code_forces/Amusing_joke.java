package Code_forces;

import java.util.Arrays;
import java.util.Scanner;
public class Amusing_joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        int n=str1.length()+str2.length();
        char [] arr1=(str1+str2).toCharArray();
        Arrays.sort(arr1);
        char [] arr2=str3.toCharArray();
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2)?"YES":"NO");
        
        
    }
}
