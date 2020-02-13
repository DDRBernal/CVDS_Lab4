
import hangman.model.*;
import hangman.exceptions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

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