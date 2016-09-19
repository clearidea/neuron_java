package main.java.Patterns.Singleton;

/**
 * Created by jeremiah on 9/19/16.
 */
public class Memory extends Base
{
    static Memory _instance;

    @Override
    public void serialize()
    {
        this._instance = this;
    }

    @Override
    public boolean invalidate()
    {
        _instance = null;
        return true;
    }

    @Override
    public boolean instance()
    {
        return true;
    }
}
