import java.util.Scanner;

public class div834{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String srt="YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
            String sd=sc.next();
            System.out.println(srt.contains(sd)?"YES":"NO");
        }
    }
}