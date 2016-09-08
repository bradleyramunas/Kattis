import com.sun.org.apache.xerces.internal.util.ShadowedSymbolTable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class PermutedArithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        for(int i = 0 ; i< times; i++){
            int number = input.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int z = 0; z<number; z++){
                a.add(input.nextInt());
            }
            boolean arith = isArithmetic(a);
            Collections.sort(a);
            boolean permarith = isArithmetic(a);
            if(arith){
                System.out.println("arithmetic");
            }else if(permarith){
                System.out.println("permuted arithmetic");
            }else{
                System.out.println("non-arithmetic");
            }

        }
    }

    public static boolean isArithmetic(ArrayList<Integer> a){
        int diff = a.get(1) - a.get(0);
        for(int i = 1; i<a.size(); i++){
            if(a.get(i) - a.get(i-1) != diff){
                return false;
            }
        }
        return true;
    }
}
