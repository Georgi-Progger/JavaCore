package com.georhuga.javacore.TicTacToe;

import java.util.Scanner;

public class GameLogic  {

    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);
    public void startGame() {
        while (true) {
            printField();
            int firsUserInput = getFirstUserInput();
            field.setItem(firsUserInput, Field.S_X);
            if (checkWinner(Field.S_X)){
                System.out.println("Игрок X выиграл");
            }
            printField();

            Integer secondUserInput = getSecondUserInput();
            field.setItem(secondUserInput, Field.S_O);
            if (checkWinner(Field.S_O)){
                System.out.println("Игрок О выиграл");
            }
            printField();
        }
    }
    private void printField() {
        String[] state = field.getStorage();
        for (int i = 0; i < 9; i++){
            if(i%3 ==2){
                System.out.print(state[i] + "\n");
            }
            else{
                System.out.print(state[i] + " ");
            }
        }
    }
    private int getFirstUserInput() {
        int firstInput = scanner.nextInt();
        if (isValid(firstInput) == false){
            getFirstUserInput();
        }
        return firstInput;
    }

    private int getSecondUserInput() {
        int secondInput = scanner.nextInt();
        if (isValid(secondInput) == false){
            getSecondUserInput();
        }
        return secondInput;
    }

    private boolean isValid(int input) {
        if (input <0 || input >8) return false;
        String[] state = field.getStorage();
        if (state[input] == field.S_EMPTY) return false;
        return true;
    }
    private boolean checkWinner(String str) {
        String[] state = field.getStorage();
        int[][] winPos = {{0,1,2},{3,4,5},{6,7,8},{1,4,7},{0,3,6},{2,5,8},{0,4,8},{2,4,6}};
        for (int i = 0;i < 8;i++){
            if (state[winPos[i][0]] == str && state[winPos[i][1]] == str && state[winPos[i][0]] == str) return true;
        }
        return  false;
    }
}
