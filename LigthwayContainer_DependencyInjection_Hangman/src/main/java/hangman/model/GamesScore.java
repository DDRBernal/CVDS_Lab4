package hangman.model;

import hangman.exceptions.hangmanException;

public interface GamesScore {
        int calculateScore(int correctCount, int incorrectCount) throws hangmanException;
}
