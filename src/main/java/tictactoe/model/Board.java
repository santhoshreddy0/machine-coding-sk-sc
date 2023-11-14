package tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> cells;

    public  Board(int n) {
        cells = new ArrayList<>();
        for(int i=0; i<n; i++) {
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<n; j++) {
                row.add(new Cell(i,j));
            }
            cells.add(row);
        }
    }

    public void print() {
        int size = cells.size();
        for (List<Cell> row : cells) {
            for (Cell c: row) {
                c.display();
            }
            System.out.println();
        }
    }

    public int getBoardSize() {
        return cells.size();
    }
}
