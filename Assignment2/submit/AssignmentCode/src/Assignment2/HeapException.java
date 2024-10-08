package Assignment2;
/**
 * Defines an exception that manipulating a full heap or an empty heap
 */
public class HeapException extends RuntimeException {
	
	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public HeapException(String message) {
		super(message);
	}
}

