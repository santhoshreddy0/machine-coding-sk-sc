package tictactoe.model;

import tictactoe.model.types.CellState;

public class Cell {
    int row;
    int col;
    Symbol symbol;
    CellState state;
    public Cell(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public void display() {
        String s = symbol == null ? " " : String.valueOf(symbol.getPlayerSymbol());
        System.out.print(s+" | ");
    }

}
