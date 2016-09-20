package main.java.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeremiah on 9/16/16.
 */
public class LogMux implements ILogger
{
    private List<ILogger> _aLogs = new ArrayList<>();

    public void addLog( ILogger Log )
    {
        this._aLogs.add( Log );
    }

    public void addLog( ILogger Log, int iLevel )
    {
        this._aLogs.add( Log );
        setRunLevel( iLevel );
    }

    public void reset()
    {
        this._aLogs.clear();
    }

    public List<ILogger> getLogs()
    {
        return this._aLogs;
    }

    @Override
    public void setRunLevel( int iLevel )
    {
        for ( ILogger Log : this.getLogs() )
        {
            Log.setRunLevel( iLevel );
        }
    }

    @Override
    public void log(String text, int iLevel)
    {
        for ( ILogger Log : this.getLogs() )
        {
            Log.log( text, iLevel );
        }
    }

    @Override
    public void debug(String text)
    {
        this.log( text, DEBUG );
    }

    @Override
    public void info(String text)
    {
        this.log( text, INFO );
    }

    @Override
    public void warning(String text)
    {
        this.log( text, WARNING );
    }

    @Override
    public void error(String text)
    {
        this.log( text, ERROR );
    }

    @Override
    public void fatal(String text)
    {
        this.log( text, FATAL );
    }
}
