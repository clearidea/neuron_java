package main.java.Data.Validation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class UrlTest
{
    @Test
    public void testFail()
    {
        assertFalse( Url.validate( "this is a test" ) );
    }

    @Test
    public void testPass()
    {
        assertTrue( Url.validate( "http://example.org" ) );
    }
}