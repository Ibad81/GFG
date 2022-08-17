package Code_forces;

import java.util.Scanner;

class Stones_on_the_table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num=sc.nextInt();
        String str=sc.next();
        char ch[]=str.toCharArray();
        if(str.length()==num){
            for (int i = 0; i < str.length()-1; i++) {
                if(ch[i]==ch[i+1]){
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}