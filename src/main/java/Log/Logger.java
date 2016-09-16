package main.java.Log;

import main.java.Log.Destination.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class Logger implements ILogger
{
    private int _iRunLevel = ERROR;
    private DestinationBase _Destination;

    public Logger( DestinationBase Dest )
    {
        this.setDestination( Dest );
    }

    //////////////////////////////////////////////////////////////

    public void setDestination( DestinationBase Dest )
    {
        this._Destination = Dest;
    }

    public DestinationBase getDestination()
    {
        return this._Destination;
    }

    @Override
    public void setRunLevel( int iLevel )
    {
        this._iRunLevel = iLevel;
    }

    public int getRunLevel()
    {
        return this._iRunLevel;
    }

    /*
    public void open()
    {
        return this.getDestination().open();
    }

    public void close()
    {
        this.getDestination().close();
    }
    */

    //////////////////////////////////////////////////////////////

    @Override
    public void log( String text, int iLevel )
    {
        if (iLevel >= this.getRunLevel() )
        {
            this.getDestination().log( text, iLevel );
        }
    }

    @Override
    public void debug( String text )
    {
        this.log( text, DEBUG );
    }

    @Override
    public void info( String text )
    {
        this.log( text, INFO );
    }

    @Override
    public void warning( String text )
    {
        this.log( text, WARNING );
    }

    @Override
    public void error( String text )
    {
        this.log( text, ERROR );
    }

    @Override
    public void fatal( String text )
    {
        this.log( text, FATAL );
    }
}
