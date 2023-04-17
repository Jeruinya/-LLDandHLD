package com.scaler.LLD.scaler.TicTacToe.factory;

import com.scaler.LLD.scaler.TicTacToe.models.BotDifficultyLevel;
import com.scaler.LLD.scaler.TicTacToe.strategy.BotPlayingStrategy;
import com.scaler.LLD.scaler.TicTacToe.strategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        return new RandomBotPlayingStrategy();
    }
}