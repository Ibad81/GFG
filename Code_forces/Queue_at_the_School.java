package Code_forces;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
     
        
        Scanner sc=new Scanner(System.in);
        int strlen=sc.nextInt();
        int steps=sc.nextInt();
        String str=sc.next();
        
        while(steps>0){
            str=str.replaceAll("BG","GB");
            steps--;
        }
        System.out.println(str);
    }
}
