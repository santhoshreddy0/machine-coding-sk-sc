package tictactoe.model;

import tictactoe.model.types.BotDifficultyLevel;
import tictactoe.model.types.PlayerType;

public class Bot extends Player{
    BotDifficultyLevel difficultyLevel;

    public Bot(String name, int id, PlayerType type, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, id, type, symbol);
        this.difficultyLevel = difficultyLevel;
    }

    public BotDifficultyLevel getLevel() {
        return difficultyLevel;
    }
}
