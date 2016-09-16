package main.java.Log.Destination;

import main.java.Log.*;
import main.java.Log.Format.*;

import java.time.ZonedDateTime;

import static main.java.Log.ILogger.DEBUG;
import static main.java.Log.ILogger.INFO;
import static main.java.Log.ILogger.WARNING;
import static main.java.Log.ILogger.ERROR;
import static main.java.Log.ILogger.FATAL;

/**
 * Created by jeremiah on 9/16/16.
 */
public abstract class DestinationBase
{
    private IFormat _Format;

    public String getLevelText( int iLevel )
    {
        switch ( iLevel )
        {
            case DEBUG:
                return "Debug";
            case INFO:
                return "Info";
            case WARNING:
                return "Warning";
            case ERROR:
                return "Error";
            case FATAL:
                return "Fatal";
            default:
                return "Unknown";
        }
    }

    public DestinationBase(IFormat Format )
    {
        this.setFormat( Format );
    }

    public void setFormat( IFormat Format )
    {
        this._Format = Format;
    }

    public abstract void write( String text, Data data );
    public abstract void open( String[] params );

    public void log( String text, int iLevel )
    {
        Data Log = new Data( ZonedDateTime.now().toString() , text, iLevel, this.getLevelText( iLevel ) );
        text = this._Format.format( Log );

        this.write( text, Log );
    }
}
