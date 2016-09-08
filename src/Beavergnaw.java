import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class Beavergnaw {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int d = scan.nextInt();
            int v = scan.nextInt();
            if(d == 0 && v == 0){
                break;
            }else{
                System.out.println(Math.cbrt((12 * v - 2 * Math.pow(d, 3) * Math.PI)/(-2 * Math.PI)));
            }
        }
    }

}
