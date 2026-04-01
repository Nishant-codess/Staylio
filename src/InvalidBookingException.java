/**
 *
 * CLASS - InvalidBookingException
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Custom exception for invalid booking scenarios.
 *
 * @author Nishant_Ranjan
 * @version 9.0
 */

public class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}