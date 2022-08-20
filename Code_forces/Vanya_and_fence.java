package Code_forces;

import java.util.Scanner;

public class Vanya_and_fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int no=sc.nextInt();
        int height=sc.nextInt();
        for(int i=0;i<no;i++){
            int num=sc.nextInt();
            if(num<=height){
                temp+=1;
            }
            else{
                temp+=2;
            }
        }
        System.out.println(temp);
    }
}
