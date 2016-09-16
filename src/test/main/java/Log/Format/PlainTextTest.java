package main.java.Log.Format;

import main.java.Log.Data;
import main.java.Log.ILogger;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class PlainTextTest
{
    static String INPUT = "Test log.";
    Data oData;

    public void setup()
    {
        this.oData = new Data( ZonedDateTime.now().toString() , INPUT, ILogger.DEBUG, "DEBUG" );
    }

    @Test
    public void format() throws Exception
    {

    }
}