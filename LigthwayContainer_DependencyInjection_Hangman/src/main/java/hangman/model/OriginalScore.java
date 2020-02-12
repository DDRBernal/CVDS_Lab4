package hangman.model;
import hangman.exceptions.*;


public class OriginalScore implements GamesScore {
    private final int MAX_SCORE=100;

    
    public int calculateScore(int correctCount, int incorrectCount) throws hangmanException{
        if (correctCount<0 || incorrectCount<0) throw new hangmanException(hangmanException.VALOR_INCORRECTO);
        int RTAcount = MAX_SCORE-(incorrectCount*10);
        return RTAcount<0?0:RTAcount;
    }
    
}
