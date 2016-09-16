package main.java.Log.Format;

import main.java.Log.Data;
import main.java.Log.ILogger;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class CSVTest extends LogTestBase
{
    static String INPUT = "Test log.";
    Data oData;

    public void setup()
    {
        this.oData = new Data( ZonedDateTime.now().toString() , INPUT, ILogger.DEBUG, "DEBUG" );
    }

    @Test
    public void testFormat() throws Exception
    {
        setup();

        CSV Csv = new CSV();

        String out = Csv.format( this.oData );

        String[] aParts = out.split(",");

        assertEquals( aParts.length, 3 );
    }
}