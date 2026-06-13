import java.util.*;
public class Food {
    private int x;
    private int y;

    public Food(int boardsize){
        generatefood(boardsize);
    }

    public void generatefood(int boardsize){
        Random random=new Random();
        x=random.nextInt(boardsize);
        y=random.nextInt(boardsize);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
