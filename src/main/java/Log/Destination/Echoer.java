package main.java.Log.Destination;

import main.java.Log.Data;
import main.java.Log.Format.IFormat;

/**
 * Created by jeremiah on 9/20/16.
 */
public class Echoer extends DestinationBase
{
    public Echoer() {}
    public Echoer( IFormat Format )
    {
        super( Format );
    }

    @Override
    public void write( String text, Data data )
    {
        System.out.println( text );
    }

    @Override
    public boolean open(String[] params)
    {
        return true;
    }
}
