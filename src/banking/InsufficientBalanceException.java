package banking;
import java.io.IOException;
public class InsufficientBalanceException extends RuntimeException
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}
