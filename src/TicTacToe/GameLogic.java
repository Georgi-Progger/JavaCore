package TicTacToe;

import java.util.Scanner;

public class GameLogic extends Field {
    void game() {
        int s = 0; //s флажок
        while (true) {
            s++;
            printField();
            userMove(s);
            if(this.checkWinner(S_X)){
                printField();
                System.out.println("Игрок №1 выиграл!!");
                break;
            }
            else if(this.checkWinner(S_O)){
                printField();
                System.out.println("Игрок №2 выиграл!!");
                break;
            }
            if(this.isFull()) {
                System.out.println("Таблица заполнена полностью.");
                System.out.println("Ничья");
                break;
            }
        }
    }
    boolean isValid(int y, int x) {

        if (x < 0 || x > 2 || y < 0 || y > 2) {
            System.out.println("Число не из диапазона)");
            return false;
        }
        return  true;
    }
    boolean checkWinner(char ch) {
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == ch && field[i][1] == ch && field[i][2] == ch) ||
                    (field[0][0] == ch && field[1][i] == ch && field[2][i] == ch)) {
                return true;
            }
        }
        if ((field[0][0] == ch && field[1][1] == ch && field[2][2] == ch) ||
                (field[2][0] == ch && field[1][1] == ch && field[0][2] == ch)) {
            return true;
        }
        return false;
    }
    void userMove(int s){
        int x = 0, y = 0;
        if (s % 2 == 1){
            System.out.println("Игрок №1, введите координаты x и y от (1,3)");
            x = scan(y)-1;
            y = scan(x)-1;
            if (isValid(x,y) && checkPosition(x,y) )
                field[x][y] = S_X;
            else userMove(s);
        }
        else if (s % 2 == 0){
            System.out.println("Игрок №2, введите координаты x и y от (1,3)");
            y = scan(y)-1;
            x = scan(x)-1;
            if (isValid(x,y) && checkPosition(y,x))
                field[y][x] = S_O;
            else userMove(s);
        }
    }
    int scan(int h){
        Scanner sc;
        sc = new Scanner(System.in);
        h = sc.nextInt();
        return h;
    }
    boolean checkPosition(int y , int x){
        if (field[y][x] != S_X && field[y][x] != S_O){
            return true;
        }
        System.out.println("Место занято!!!!");
        return false;
    }
    boolean isFull() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (this.field[i][j] == S_EMPTY)
                    return false;

            }
        }

        return true;
    }
}