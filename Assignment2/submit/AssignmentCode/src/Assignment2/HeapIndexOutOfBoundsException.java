package Assignment2;

/**
 * Defines an exception that the index out of range
 */
public class HeapIndexOutOfBoundsException extends IndexOutOfBoundsException {
	
	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public HeapIndexOutOfBoundsException(String message) {
		super(message);
	}
}
