public class SumaException extends Exception {
    public SumaException() {
    }

    public SumaException(String message) {
        super(message);
    }

    public SumaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SumaException(Throwable cause) {
        super(cause);
    }

    public SumaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
