import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Bradley on 9/7/2016.
 */
class Coordinate{
    public int x;
    public int y;
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof  Coordinate){
            return (this.x == ((Coordinate) c).x && this.y == ((Coordinate) c).y);
        }
        return false;
    }

    @Override
    public String toString(){
        return "(" + (this.x+1) + "," + (this.y+1) +")";
    }

}

public class EightQueens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Coordinate> coords = new ArrayList<>();
        for(int i = 0; i<8; i++){
            String line = input.nextLine();
            for(int z = 0; z<line.length(); z++){
                if(line.charAt(z) == '*'){
                    coords.add(new Coordinate(i,z));
                }else{
                }
            }
        }
//        for(Coordinate c : coords){
//            System.out.println(c);
//        }
        boolean result = validate(coords);
        if(result){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }

    public static boolean validate(ArrayList<Coordinate> coords){
        if(coords.size() != 8) return false;
        for(Coordinate c : coords){

            if(!checkIfCorrect(c, coords)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfCorrect(Coordinate c, ArrayList<Coordinate> coords){
        int x = c.x;
        while(x < 8){
            x++;
            if(coords.contains(new Coordinate(x, c.y))){
                return false;
            }
        }
        x = c.x;
        while(x>-1){
            x--;
            if(coords.contains(new Coordinate(x, c.y))){
                return false;
            }
        }
        int y = c.y;
        while(y < 8){
            y++;
            if(coords.contains(new Coordinate(c.x, y))){
                return false;
            }
        }
        y = c.y;
        while(y > -1){
            y--;
            if(coords.contains(new Coordinate(c.x, y))){
                return false;
            }
        }
        x = c.x;
        y = c.y;
        while(x > -1 && y > -1){
            x--;
            y--;
            if(coords.contains(new Coordinate(x,y))){
                return false;
            }
        }
        x = c.x;
        y = c.y;
        while(x<8 && y > -1){
            x++;
            y--;
            if(coords.contains(new Coordinate(x,y))){
                return false;
            }
        }
        x = c.x;
        y = c.y;
        while(x > -1 && y < 8){
            x--;
            y++;
            if(coords.contains(new Coordinate(x,y))){
                return false;
            }
        }
        x = c.x;
        y = c.y;
        while(x < 8 && y < 8){
            x++;
            y++;
            if(coords.contains(new Coordinate(x,y))){
                return false;
            }
        }
        return true;
    }

}
