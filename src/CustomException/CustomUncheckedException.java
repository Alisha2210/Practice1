package CustomException;

public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String errorMessage){
        super(errorMessage);
    }
}
