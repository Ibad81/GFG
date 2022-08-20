package Code_forces;
import java.util.HashSet;
import java.util.Scanner;
public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet();
        int n_levels=sc.nextInt();
        int X_games=sc.nextInt();
        for (int i = 0; i < X_games; i++) {
           
           
           hs.add(sc.nextInt());
           
        }
        int Y_games=sc.nextInt();
        for (int i = 0; i < Y_games; i++) {
           
            hs.add(sc.nextInt());
           
        }
        System.out.println(hs.size()==n_levels?"I become the guy." :"Oh, my keyboard!");
 
    }
}