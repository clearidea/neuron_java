package main.java.Util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/15/16.
 */
public class TimerTest
{
    @Test
    public void testTimer() throws Exception
    {
        Integer iOffset = 5;

        Timer oTimer = new Timer( iOffset );

        Integer iElapsed = oTimer.getElapsed();

        assertEquals( iElapsed, iOffset );
    }
}