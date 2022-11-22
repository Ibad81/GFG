import java.util.Scanner;
public class A96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.contains("0000000")||str.contains("1111111")?"YES":"NO");
    }
}
