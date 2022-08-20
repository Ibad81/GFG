package Code_forces;

import java.util.Scanner;

public class Beautiful_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int temp=0;
        for(int i=1000;i<=9000;i++){
            for (int j = i; j <= 9000; j++) {
                if(str.charAt(j)==str.charAt(j+1)){
                    temp++;
                }
            }
        }
        System.out.println(temp);
    }
            
}

