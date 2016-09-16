package main.java.Data.Validation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class IPAddressTest
{
    @Test
    public void testFail() throws Exception
    {
        assertFalse( IPAddress.validate( "example.org" ) );
    }

    @Test
    public void testPass() throws Exception
    {
        assertTrue( IPAddress.validate( "192.168.1.1" ) );
    }
}