import java.util.ArrayList;

public class Snake {
    private ArrayList<Position> body;
    // private char direction;
    private char direction;


    public Snake(){
        body=new ArrayList<>();
        body.add(new Position(5,5));
        body.add(new Position(4, 5));
        body.add(new Position(3, 5));
        direction='R';
    }
    public Position getHead(){
        return body.get(0);
    }
    public ArrayList<Position> getBody(){
        return body;
    }
    public void addBody(){
       Position tail=body.get(body.size()-1);
       body.add(new Position(tail.x,tail.y));

    }
    
    // Position head =body.get(0);
    // public int getX(){
    //     return head.x;
    // }
    // public int getY(){
    //     return head.y;
    // }
    public char getDirection(){
        return direction;
    }

    public void setDirection(char direction){
        this.direction=direction;
    }

    public boolean collision(){
        Position head=body.get(0);
        for(int i=1;i<body.size();i++){
            Position part=body.get(i);
            if(part.x==head.x && part.y==head.y){
                return true;
            }
        }
        return false;
    }
    
    public void move(){
        Position head=getHead();
        int x=head.x;
        int y=head.y;
        switch(direction){
            case 'U':
                y--;
                break;
            case 'D':
                y++;
                break;
            case 'R':
                x++;
                break;
            case 'L':
                x--;
                break;
        }
        body.add(0, new Position(x, y));
        body.remove(body.size() - 1);
    }
    
}
