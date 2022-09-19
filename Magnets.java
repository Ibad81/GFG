import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = sc.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] != arr[i-1]) {
                count++;
                
            }
            
        }
        System.out.println(count);
    }

}
