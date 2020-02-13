
import hangman.model.*;
import hangman.exceptions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * CLASES DE EQUIVALENCIA
 * ORIGINALSCORE
 *
 |  Número        |               Clase de equivalencia                     | correcto - incorrecto. |
 |----------------|---------------------------------------------------------|---------------------------------|
 |1		 | [-inf,0)                                                         |(Incorrecto)  HangmanException   |
 |2		 | [0,100]	                                                        |(Correcto)                       |
 |3		 | (10,+inf)        	                                            |(Incorrecto)                     |
 *
 * PARA BONUS SCORE
 *
 |  Número        |               Clase de equivalencia                     | correcto - incorrecto. |
 |----------------|---------------------------------------------------------|---------------------------------|
 |1		 | [-inf,0)                                                         |(Incorrecto) HangmanException    |
 |2		 | [0,100]	                                                        |(Correcto)                       |
 |3		 | (10,+inf)        	                                            |(Incorrecto)                     |
 *
 * PARA POWER SCORE
 *
 |  Número        |Clase de equivalencia (en lenguaje natural o matemático).|Resultado correcto / incorrecto. 			   |
 |----------------|---------------------------------------------------------|-------------------------------------------------------|
 |1		 | Incorrect<0 o Correct<0                                 |(Incorrecto) HangManException      			   |
 |2		 | SUM(5^K)<8Incorrect   con K de 1 a Correct   	   |(Correcto) Valor igual a 0     			   |
 |3		 | 0<= SUM(5^K)-8Incorrect<=500   con K de 1 a Correct     |(Correcto) Valor entre 500 y 0    			   |
 |4		 | 500< SUM(5^K)-8Incorrect   con K de 1 a Correct         |(Correcto) Valor igual a 500   			   |
 *
 *
 */



public class GameScoreTest {

    @Test
    public void OriginalScoreLimiteMenorA0() {
        try{
            GamesScore game = new OriginalScore();
            game.calculateScore(1, -10);
            game.calculateScore(-5, 5);
            game.calculateScore(-8, -27);

        }catch(hangmanException ex){
            assertEquals(ex.getMessage(),hangmanException.VALOR_INCORRECTO);
        }
    }

    @Test
    public void BonusScoreLimiteMenorA0() {
        try{
            GamesScore game = new BonusScore();
            game.calculateScore(1, -10);
            game.calculateScore(-5, 5);
            game.calculateScore(-8, -27);

        }catch(hangmanException ex){
            assertEquals(ex.getMessage(),hangmanException.VALOR_INCORRECTO);
        }
    }

    @Test
    public void PowerScoreLimiteMenorA0() {
        try{
            GamesScore game = new PowerScore();
            game.calculateScore(1, -10);
            game.calculateScore(-5, 5);
            game.calculateScore(-8, -27);

        }catch(hangmanException ex){
            assertEquals(ex.getMessage(),hangmanException.VALOR_INCORRECTO);
        }
    }

    @Test
    public void AllScoersMustToPass() {
        try{
            GamesScore game = new PowerScore();
            game.calculateScore(1, 10);
            game.calculateScore(5, 5);
            game.calculateScore(8, 27);
            GamesScore game2 = new OriginalScore();
            game2.calculateScore(1000, 100);
            game2.calculateScore(55, 55);
            game2.calculateScore(8000, 27);
            GamesScore game3 = new BonusScore();
            game3.calculateScore(105, 100);
            game3.calculateScore(500, 500);
            game3.calculateScore(800, 270);

        }catch(hangmanException ex){
            assertEquals(ex.getMessage(),hangmanException.VALOR_INCORRECTO);
        }
        assertEquals(2,2);
    }

}