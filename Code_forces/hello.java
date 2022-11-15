import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s1=str.substring(" ");

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse().toString());
    }
}
