/**
 * Created by varunsaraogi on 2/9/16.
 */
public class Exercise {
    public void generate(int n){
        int prime;
        for(int factor=2;factor<n/2;factor++){
            if(n%factor==0){
                for(prime=2;prime<factor;prime++){
                    if(factor%prime==0){
                        break;
                    }
                }
                if(prime==factor){
                    System.out.println(factor);
                }
            }
        }
    }
    public static void main(String args[]){
        new Exercise().generate(30);
    }
}
