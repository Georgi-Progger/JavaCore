package TicTacToe;

public class Field {
    protected final char S_X = 'x';
    protected final char S_O = 'o';
    protected final char S_EMPTY = '_';
    protected char[][] field;
    Field(){
        field = new char[3][3];
        initTable(field);
    }
    void initTable(char[][] ch){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                ch[i][j] = S_EMPTY;
            }
        }
    }
    void printField() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(this.field[row][col] + " ");
            }
            System.out.print("\n");
        }
    }
}
