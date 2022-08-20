package Code_forces;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        // String str="EASY";
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            if (num==1){
                temp++;
            }
            
        }
        if(temp!=0){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
        
    
        
    }
}
