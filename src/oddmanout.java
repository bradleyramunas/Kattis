import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Bradley on 2/7/2016.
 */
public class oddmanout {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int times = Integer.parseInt(input.nextLine());
        for(int i = 0; i<times; i++){
            int guests = Integer.parseInt(input.nextLine());
            Map<Integer, Integer> registrar = new HashMap<>();
            for(int z = 0; z<guests; z++){
                int num = input.nextInt();
                if(registrar.get(num)== null){
                    registrar.put(num, 1);
                }else{
                    registrar.remove(num);
                    registrar.put(num, 2);
                }
            }
            for(int a : registrar.keySet()){
                if(registrar.get(a) == 1){
                    System.out.printf("Case #%d: %d\n", (i+1), a);
                }
            }
            String ignore = input.nextLine();
        }
    }
}
