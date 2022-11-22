import java.util.Scanner;
public class A133_900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.contains("H")||str.contains("Q")||str.contains("9")||str.contains("+")?"YES":"NO");
    }
}
