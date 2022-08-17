package Code_forces;

import java.util.Scanner;

public class Soldier_and_banana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cost_of_ban=sc.nextInt();
        int initial_money=sc.nextInt();
        int no_of_banan=sc.nextInt();
        int sum=cost_of_ban;
        for(int i=2;i<=no_of_banan;i++){
            sum+=i*cost_of_ban;
        }
        if(sum<=initial_money){
            System.out.println(0);
        }else{
            System.out.println(sum-initial_money);
        }
    }
}
