import java.util.Scanner;

/**
 * Created by varunsaraogi on 2/9/16.
 */
public class Draw_a_right_triangle {
    public static void main(String args[]){
        System.out.print("n=");
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        for(int line=0;line<length;line++){
            for(int index=0;index<=line;index++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
