package com.scaler.LLD.scaler.TicTacToe.strategy;

import com.scaler.LLD.scaler.TicTacToe.models.Board;
import com.scaler.LLD.scaler.TicTacToe.models.Cell;
import com.scaler.LLD.scaler.TicTacToe.models.CellState;
import com.scaler.LLD.scaler.TicTacToe.models.Move;
import com.scaler.LLD.scaler.TicTacToe.models.Player;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move decideMove(Player player, Board board) {

        for (int i = 0; i < board.getBoard().size(); ++i) {
            for (int j = 0; j < board.getBoard().size(); ++j) {
                if (board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    return new Move(
                            player,
                            new Cell(i, j)
                    );
                }
            }
        }

        return null;
    }
}