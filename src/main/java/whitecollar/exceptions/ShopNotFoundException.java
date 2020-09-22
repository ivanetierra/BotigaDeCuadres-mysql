package whitecollar.exceptions;


public class ShopNotFoundException extends RuntimeException
{
    public ShopNotFoundException(Long id)
    {
        super("Could not find Shop with ID: " + id);
    }
}
