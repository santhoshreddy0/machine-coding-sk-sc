package tictactoe.model;

import tictactoe.model.types.PlayerType;

public class Player {
    String name;
    int id;
    PlayerType type;
    Symbol symbol;

    public Player(String name, int id, PlayerType type, Symbol symbol) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.symbol = symbol;
    }
}
