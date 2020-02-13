package hangman.model;
import java.lang.Math;
import hangman.exceptions.hangmanException;

public class PowerScore implements GamesScore {
    private int puntos;
    private int penalizacion;

    /**
     * 
     *@pre
     *@pos
     *@param correctCount , int incorrectCount
     *@throws
     */
    public int calculateScore(int correctCount, int incorrectCount) throws hangmanException{
        if (correctCount<0 || incorrectCount<0) throw new hangmanException(hangmanException.VALOR_INCORRECTO);
        int suma=0;
        for (int i=0;i<correctCount;i++){
            suma+= Math.pow(5,i);
        }
        int rta=suma-(8*incorrectCount);
        return rta>500?500:rta;
    }
    
}
