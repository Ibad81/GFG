import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_round_numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            int num=sc.nextInt();
            int multiplier=1;
            while(num>0){
                int rem=num%10;
                rem=rem*multiplier;
                if(rem!=0){
                    arr.add(rem);
                }
                num=num/10;
                multiplier*=10;

            }
            System.out.println(arr.size());
            for (int val: arr) {
                System.out.print(val+" ");
            }
            System.out.println();
            
            
                
        }
    }
}

