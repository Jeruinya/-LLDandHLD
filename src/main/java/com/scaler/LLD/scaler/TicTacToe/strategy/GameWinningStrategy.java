package com.scaler.LLD.scaler.TicTacToe.strategy;

import com.scaler.LLD.scaler.TicTacToe.models.Board;
import com.scaler.LLD.scaler.TicTacToe.models.Cell;
import com.scaler.LLD.scaler.TicTacToe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board,
                               Player lastMovePlayer,
                               Cell moveCell);
}