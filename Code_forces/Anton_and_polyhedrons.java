package Code_forces;

import java.util.Scanner;
public class Anton_and_polyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c =0;
        for (int i = n; i>0; i--) {
            String str=sc.next();
            if(str.equals("Tetrahedron")){
                c =c+4;
            }
            else if(str.equals("Cube")){
                c=c+6;
            }
            else if(str.equals("Octahedron")){
                c=c+8;
            }
            else if(str.equals("Dodecahedron")){
                c=c+12;
            }
            else{
                c=c+20;
            }
        }
        System.out.println(c);
    }
}
