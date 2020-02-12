package hangman.model;

import hangman.exceptions.hangmanException;

public class BonusScore implements GamesScore {
    private int puntos=0;

    /**
     * 
     *@pre
     *@pos
     *@param correctCount, int incorrectCount
     *@throws
     */
    public int calculateScore(int correctCount, int incorrectCount) throws hangmanException {
        if (correctCount<0 || incorrectCount<0) throw new hangmanException(hangmanException.VALOR_INCORRECTO);
        puntos+=(correctCount*10)-(incorrectCount-5);
        return puntos<0?0:puntos;
    }
}
