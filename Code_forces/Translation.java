package Code_forces;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int temp=0;
        int n=str1.length();
        char [] ch=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        char [] arr1=new char[str1.length()];

        for (int i = ch.length-1; i >=0; i--) {
            arr1[n-i-1]=ch[i];
            
        }

        
        
        
        
        if(str1.length()==str2.length()){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]==arr2[i]){
                    temp++;
                    
                }
                
            }
            if(temp==str1.length()){
                System.out.println("YES");
            }
            
            else{
                System.out.println("NO");
            }
        }
        else if(str1.length()!=str2.length()){
            System.out.println("NO");
        }
        
    }
}
