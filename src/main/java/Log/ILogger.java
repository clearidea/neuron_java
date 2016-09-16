package main.java.Log;

/**
 * Created by jeremiah on 9/16/16.
 */
public interface ILogger
{
    int DEBUG      = 0;
    int INFO       = 10;
    int WARNING    = 20;
    int ERROR      = 30;
    int FATAL      = 40;

    void log( String text, int iLevel );
    void setRunLevel( int iLevel );

    void debug( String text );
    void info( String text );
    void warning( String text );
    void error( String text );
    void fatal( String text );
}
