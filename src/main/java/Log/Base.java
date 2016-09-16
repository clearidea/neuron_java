package main.java.Log;

/**
 * Created by jeremiah on 9/16/16.
 */
class Base implements ILogger
{
    private ILogger _Logger;

    // Default Constructor
    public Base() {}

    // Constructor with Logger
    public Base( ILogger Logger )
    {
        this._Logger = Logger;
    }

    /**
     * @return ILogger
     */
    public ILogger getLogger()
    {
        return this._Logger;
    }

    /**
     * @param text
     * @param iLevel
     *
     * Writes to the logger. Defaults to debug level.
     * Data is only written to the log based on the loggers run-level
     */
    @Override
    public void log(String text, int iLevel)
    {
        if ( iLevel != INFO || iLevel != WARNING || iLevel != ERROR || iLevel != FATAL )
            iLevel = DEBUG;

        this._Logger.log( this.getClass() +": "+ text, iLevel );
    }

    @Override
    public void setRunLevel(int iLevel)
    {
        this._Logger.setRunLevel( iLevel );
    }

    @Override
    public void debug(String text)
    {
        this._Logger.debug( text );
    }

    @Override
    public void info(String text)
    {
        this._Logger.info( text );
    }

    @Override
    public void warning(String text)
    {
        this._Logger.warning( text );
    }

    @Override
    public void error(String text)
    {
        this._Logger.error( text );
    }

    @Override
    public void fatal(String text)
    {
        this._Logger.fatal( text );
    }
}
