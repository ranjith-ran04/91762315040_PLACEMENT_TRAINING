public class Board{
    private final int size=10;
    private char grid[][];
    public Board(){
        grid=new char[size][size];
    }
    public void initialize(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j]='-';
            }
        }
    }

    public void display(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void placesnake(int x,int y){
        grid[y][x]='S';
    }

    public void placefood(int x,int y){
        grid[y][x]='F';
    }

    public int getSize(){
        return size;
    }
}