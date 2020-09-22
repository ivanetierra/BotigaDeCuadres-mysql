package whitecollar.exceptions;

public class CollarNotFoundException extends RuntimeException
{
    public CollarNotFoundException(Long id)
    {
        super("Could not find collar with ID: " + id);
    }
}
