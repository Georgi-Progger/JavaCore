package Module1.TicTacToe;
import java.util.*;

class GameLogic {
    private Field gameField;
    Scanner scan;
    private boolean zeroMove = true;

    GameLogic() {
        gameField = new Field();
        scan = new Scanner(System.in);
    }

    void gameMove() {
        if(gameField.checkWin())
        {
            if(zeroMove) System.out.println("Крестик победил");
            else System.out.println("Нолик победил");
            return;
        }
        gameField.printField();
        if (zeroMove)
            System.out.println("Ходит ноль");
        else System.out.println("Ходит крестик");
        System.out.println("Введите кординаты (x y):");

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("-------------------------------");
        if(!isCordValid(x,y)) gameMove();

        if(zeroMove)
            gameField.setZero(x,y);
        else gameField.setCross(x,y);
        
        zeroMove = !zeroMove;
        gameMove();
    }

    boolean isCordValid(int x, int y) {

        if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("Число не из диапазона [1;3])");
            return false;
        }
        return  true;
    }
}