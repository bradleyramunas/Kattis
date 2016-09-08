import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
public class ThreePowers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            BigInteger number = input.nextBigInteger();
            if (number.equals(BigInteger.ZERO)) {

            }else if(number.equals(BigInteger.ONE)){
                System.out.println("{ }");
            }else{
                BigInteger bigInteger = number.add(BigInteger.valueOf(-1));
                String bits = bigInteger.toString(2);
                String result = "{ ";
                for(int i = 0; i<bits.length(); i++){
                    if(bits.charAt(bits.length()-i-1) == '1'){
                        result += BigInteger.valueOf(3).pow(i).toString() + ", ";
                    }
                }
                result = result.substring(0, result.length()-2);
                result += " }";
                System.out.println(result);

            }
        }

    }
}
