package main.java.Patterns.Singleton;

/**
 * Created by jeremiah on 9/19/16.
 */
public class Base implements ISingleton
{

    public static void getInstance()
    {

    }

    @Override
    public void serialize() {}

    @Override
    public boolean invalidate()
    {
        return true;
    }

    @Override
    public boolean instance()
    {
        return true;
    }
}
