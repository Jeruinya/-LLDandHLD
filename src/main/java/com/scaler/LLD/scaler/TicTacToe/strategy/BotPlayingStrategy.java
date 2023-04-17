package com.scaler.LLD.scaler.TicTacToe.strategy;

import com.scaler.LLD.scaler.TicTacToe.models.Board;
import com.scaler.LLD.scaler.TicTacToe.models.Move;
import com.scaler.LLD.scaler.TicTacToe.models.Player;

public interface BotPlayingStrategy {

    Move decideMove(Player player,Board board);
}