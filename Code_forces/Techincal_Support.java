import java.util.Scanner;

public class Techincal_Support {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String str=sc.next();
            char [] ch=str.toCharArray();
            int count1=0;
            int count2=0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[j]=='Q'){
                    count1=count1+1;
                }
                else{
                    count1=Math.max(0,count1-1);
                }

                
            }
            
            if(count1==0){
                System.out.println("Yes");
                
            }
            else{
            System.out.println("No");
            }
            
        } 
    }
}
