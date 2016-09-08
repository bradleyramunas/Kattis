import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class SimonSays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int times = Integer.parseInt(input.nextLine());
        for(int i = 0; i<times; i++){
            String enter = input.nextLine();
            if(enter.startsWith("Simon says ")){
                System.out.println(enter.substring(11));
            }
        }
    }
}
