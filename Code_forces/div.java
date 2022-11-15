import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int size=sc.nextInt();
            int arr[]=new int[size];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            if(arr[0]==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
