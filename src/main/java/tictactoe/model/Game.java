package tictactoe.model;

import tictactoe.model.types.GameState;
import tictactoe.strategy.WinningRule;

import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    List<Move> playerMoves;
    Integer nextPlayerindex;
    GameState gameState;
    List<WinningRule> winningRules;

    private Game() {

    }

    public static Builder getBuilder() {
        return new Builder();
    }
    static class Builder {
        //validations
        //1. atleast on human
        //2. size of board N >=3
        //3. no of players should N-1
        List<Player> players;

        private Builder() {

        }
    }
}
