import java.util.Scanner;

public class Game{
    private Board board;
    private Snake snake;
    private Food food;
    private int score=0;


    public Game(){
        board=new Board();
        snake=new Snake();
        food=new Food(board.getSize());
    }

    public void start(){
        Scanner scanner=new Scanner(System.in);
        
        while(true){
            // board.board();
        board.initialize();
        
        
        board.placefood(food.getX(),food.getY());
        // board.placesnake(snake.getHead().x,snake.getHead().y);
        for(Position p:snake.getBody()){
            board.placesnake(p.x,p.y);
        }
        board.display();
        
        System.out.println("Enter a move (W,A,S,D)");
        char move=Character.toUpperCase(scanner.next().charAt(0));
        System.out.println();
        
        switch(move){
            case 'W':
                snake.setDirection('U');
                break;
            case 'A':
                snake.setDirection('L');
                break;
            case 'S':
                snake.setDirection('D');
                break;
            case 'D':
                snake.setDirection('R');
                break;
            default:
                System.out.println("Invalid move");
                break;   
        }

        snake.move();
        System.out.println();
        // board.display();
        System.out.println();

        if(snake.getHead().x==food.getX() && snake.getHead().y==food.getY()){
            System.out.println("Food Eaten");
            score++;
            System.out.println(score);
            food.generatefood(board.getSize());
    //         System.out.println(
    //     "New Food Position: " +
    //     food.getX() + "," + food.getY());  
            snake.addBody();
            
            
        }

        if(snake.getHead().x<0 || snake.getHead().x>=board.getSize() || snake.getHead().y<0 || snake.getHead().y>=board.getSize() || snake.collision()){
            System.out.println("Game over");
            break;
        }
    }
    scanner.close();

    }
}