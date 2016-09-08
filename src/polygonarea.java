import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * Created by Bradley on 2/7/2016.
 */
public class polygonarea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean testing = true;
        while(testing){
            int points = Integer.parseInt(input.nextLine());
            if(points == 0) break;
            int[] x = new int[points+1];
            int[] y = new int[points+1];
            for(int i = 0; i<points; i++){
                int x1 = input.nextInt();
                int y1 = input.nextInt();
                x[i] = x1;
                y[i] = y1;
            }
            boolean cw = y[1] - y[0] <= 0;
            if(!cw){
                for (int k = 0; k < x.length/2; k++) {
                    int temp = x[k];
                    x[k] = x[x.length-(1+k)];
                    x[x.length-(1+k)] = temp;
                }
                for (int k = 0; k < y.length/2; k++) {
                    int temp = y[k];
                    y[k] = y[y.length-(1+k)];
                    y[y.length-(1+k)] = temp;
                }
            }
            x[points] = x[0];
            y[points] = y[0];
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i<x.length-1; i++){
                sum1 += x[i] * y[i+1];
            }
            for(int i = 0; i<x.length-1; i++){
                sum2 += y[i] * x[i+1];
            }
            double area = (Math.abs(sum1 + sum2))/2.0;
            if(cw){
                System.out.println("CW " + area);
            }else{
                System.out.println("CCW " + area);
            }
            input.nextLine();
        }
    }
}
