import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class Bishops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int number = input.nextInt();
            if(number != 1){
                System.out.println(number*2-2);
            }else if(number == 1){
                System.out.println(1);
            }

        }
    }
}
