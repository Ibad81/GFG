package Code_forces;

import java.util.Scanner;

public class Nearly_lucky_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] str1=str.toCharArray();
        int temp=0;
        for (int i = 0; i < str.length(); i++) {
            if(str1[i]=='4'||str1[i]=='7') {
                temp++;
            }
            
            


        }
//        System.out.println(temp);
        if(temp==7 || temp==4){
            System.out.println("YES");
        }
        // else if(temp==1){
        //     System.out.println("NO");
        // }

        else{
            System.out.println("NO");
        }
    }
}