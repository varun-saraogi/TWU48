import java.util.Scanner;

/**
 * Created by varunsaraogi on 2/9/16.
 */
public class Isosceles_triangle {
    public static void main(String args[]){
        System.out.print("n=");
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        for(int line=0;line<length;line++){
            for(int space=line;space<length-1;space++) {
                System.out.print(" ");
            }
            for(int star=0;star<=2*line;star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
