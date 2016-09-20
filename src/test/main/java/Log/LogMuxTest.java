package main.java.Log;

import main.java.Log.Destination.Echoer;
import main.java.Log.Format.JSON;
import main.java.Log.Format.PlainText;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/20/16.
 */
public class LogMuxTest
{
    public LogMux _Mux;

    @Before
    public void setUp() throws Exception
    {
        this._Mux = new LogMux();

        this._Mux.addLog(
                new Logger(
                        new Echoer(
                                new PlainText( false )
                        )
                ),
                ILogger.INFO
        );

        this._Mux.addLog(
                new Logger(
                        new Echoer(
                                new JSON()
                        )
                ),
                ILogger.WARNING
        );
    }

    @Test
    public void testPass()
    {
        this._Mux.setRunLevel( ILogger.DEBUG );
        String test = "this is a test";

        /////////////////////////////////////////////////////////
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        /////////////////////////////////////////////////////////

        // INFO TEST
        this._Mux.info( test );
        String s = baos.toString();
        assertTrue( s.contains(test) );
        baos.reset();

        // WARNING TEST
        this._Mux.warning( test );
        s = baos.toString();
        assertTrue( s.contains( "\"text\":\""+test+"\"" ));
        baos.reset();

        /////////////////////
        System.out.flush();
        System.setOut( old );
        /////////////////////
    }

    @Test
    public void testFail()
    {
        this._Mux.setRunLevel( ILogger.INFO );
        String test = "this is a test";

        /////////////////////////////////////////////////////////
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        /////////////////////////////////////////////////////////

        this._Mux.debug( test );
        String s = baos.toString();
        assertTrue( s.equals("") );
        baos.reset();

        /////////////////////
        System.out.flush();
        System.setOut( old );
        /////////////////////
    }
}