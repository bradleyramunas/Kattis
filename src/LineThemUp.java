import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class LineThemUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int people = Integer.parseInt(input.nextLine());
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> reversed = new ArrayList<>();
        for(int i = 0; i<people; i++){
            String name = input.nextLine();
            names.add(name);
            sorted.add(name);
            reversed.add(name);
        }
        Collections.sort(sorted);
        Collections.sort(reversed);
        Collections.reverse(reversed);


        if(names.equals(sorted)){
            System.out.println("INCREASING");
        }else if(names.equals(reversed)){
            System.out.println("DECREASING");
        }else{
            System.out.println("NEITHER");
        }
    }
}
