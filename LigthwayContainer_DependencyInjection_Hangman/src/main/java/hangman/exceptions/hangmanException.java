package hangman.exceptions;


public class hangmanException extends Exception{
    public static final String VALOR_INCORRECTO = "El valor no es correcto";

    public hangmanException(String message){
        super(message);
    }
}