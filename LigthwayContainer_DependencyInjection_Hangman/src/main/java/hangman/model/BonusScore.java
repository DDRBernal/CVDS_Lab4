package hangman;

public class BonusScore implements GameScore {
    private int puntos;
    private int penalizacion;
    

    public BonusModel(){

    }

    /**
     * 
     *@pre
     *@pos
     *@param int correntCount, int incorrectCount
     *@throws
     */
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
