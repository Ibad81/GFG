package div835;

import java.util.Arrays;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nam=sc.nextInt();
        for(int bn=0;bn<nam;bn++){

        
            int man[] =new int[3];
            for (int mn = 0; mn < man.length; mn++) {
                man[mn]=sc.nextInt();
            }
            Arrays.sort(man);
            System.out.println(man[1]);
        }
    }
}