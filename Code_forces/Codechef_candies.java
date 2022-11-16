import java.util.ArrayList;
import java.util.Scanner;

public class Codechef_candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int term=sc.nextInt();
        while(term-->0) {
            int len=sc.nextInt();
            int arr[]=new int[len*2];
            for(int j=0;j<len*2;j++){
                arr[j]=sc.nextInt();

            }
            ArrayList<Integer> arra=new ArrayList<>(len);

            ArrayList<Integer> arrb=new ArrayList<>(len);
            boolean ans=false;
            for (int i = 0; i < arr.length/2; i++) {
                arra.add(arr[i]);

            }
            for (int i = arr.length/2; i < arr.length; i++) {
                arrb.add(arr[i]);
            }
            for(int i=0;i<arra.size();i++){
                arra.contains(arrb.get(i));
            }
            
        }
        
    }
}
