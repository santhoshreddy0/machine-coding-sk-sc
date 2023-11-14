package tictactoe;

import tictactoe.model.Board;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        get board size
//        get players
//        start game everything is fine
//        player moves
//        store moves to list for undo
//        check for winning after every move
//        if some wins display winner

        Scanner sc = new Scanner(System.in);
        int boardSize = sc.nextInt();

        Board b = new Board(boardSize);
        b.print();

    }
}
