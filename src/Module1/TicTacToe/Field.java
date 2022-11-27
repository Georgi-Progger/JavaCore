package Module1.TicTacToe;

public class Field {
    private char[][] gameField;
    private  final char ZERO = '0';
    private  final char CROSS = '✗';
    Field() {
        gameField = new char[3][3];
    }
    void printField() {
        for (int i = 0;i < 3;i++)
        {
            for (int j = 0;j < 3;j++)
            {
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }
    }
    void setZero(int x, int y){
        gameField[x-1][y-1] = ZERO;
    }
    void setCross(int x, int y){
        gameField[x-1][y-1] = CROSS;
    }
    private boolean checkWin(char chr) {
        for (int i = 0; i < 3; i++) {
            if ((gameField[i][0] == chr && gameField[i][1] == chr && gameField[i][2] == chr) ||
                    (gameField[0][i] == chr && gameField[1][i] == chr && gameField[2][i] == chr))
                return true;
        }

        if ((gameField[0][0] == chr && gameField[1][1] == chr && gameField[2][2] == chr) ||
                (gameField[2][0] == chr && gameField[1][1] == chr && gameField[0][2] == chr))
            return true;

        return false;
    }
    public boolean checkWin(){
        return checkWin(ZERO) || checkWin(CROSS);
    }
}
