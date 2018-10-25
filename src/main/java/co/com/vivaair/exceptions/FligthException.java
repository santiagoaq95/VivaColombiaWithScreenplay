package co.com.vivaair.exceptions;

public class FligthException extends AssertionError {
	private static final long serialVersionUID = 5L;
	public static final String MESSAGE_FLIGTH_NOT_FOUND="No flights were found";
	public static final String MESSAGE_FLIGTH_IS_NOT_THE_SAME="The flight is not the same as the chosen one";
	
	public FligthException(String message, Throwable cause) {
		super(message,cause);
	}
}
