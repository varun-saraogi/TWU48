import java.util.Scanner;

/**
 * Created by varunsaraogi on 2/9/16.
 */
public class Diamond_with_name {
    public static void main(String args[]){
        System.out.print("n=");
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        System.out.print("name=");
        String name = scan.next();
        for(int line=0;line<length-1;line++){
            for(int space=line;space<length-1;space++) {
                System.out.print(" ");
            }
            for(int star=0;star<=2*line;star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(name);
        for(int line=0;line<length-1;line++){
            for(int space=0;space<=line;space++) {
                System.out.print(" ");
            }
            for(int star=0;star<=2*(length-line-2);star++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
