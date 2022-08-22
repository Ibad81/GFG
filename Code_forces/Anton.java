package Code_forces;

import java.util.HashSet;
import java.util.Scanner;

public class Anton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String set=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i < set.length() ; i++) {
            if(set.charAt(i)>='a' && set.charAt(i)<='z' ){
                hs.add(set.charAt(i));
            }
        }
        System.out.println(hs.size());
    }
}
