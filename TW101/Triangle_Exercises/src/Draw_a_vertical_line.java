import java.util.Scanner;

/**
 * Created by varunsaraogi on 2/9/16.
 */
public class Draw_a_vertical_line {
    public static void main(String args[]){
        System.out.print("n=");
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        for(int loop=0;loop<length;loop++)
            System.out.print("*\n");
    }
}
