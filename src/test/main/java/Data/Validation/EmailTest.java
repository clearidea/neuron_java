package main.java.Data.Validation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/16/16.
 */
public class EmailTest
{
    @Test
    public void testFail() throws Exception
    {
        assertFalse( Email.validate( "test_example.org" ) );
        assertFalse( Email.validate( "test-example@org" ) );
        assertFalse( Email.validate( "test-example@us" ) );
        assertFalse( Email.validate( "test-example@123.123.123.123" ) );
        assertFalse( Email.validate( "test-example@notarealemailaddress.y" ) );
    }

    @Test
    public void testPass() throws Exception
    {
        assertTrue( Email.validate( "test@example.org" ) );
    }
}