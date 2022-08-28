package Code_forces;
import java.util.Scanner;
import java.util.Arrays;
public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[2]-arr[0]);
    }
}
