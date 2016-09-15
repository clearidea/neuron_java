package main.java.Data;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/15/16.
 */
public class ArrayHelperTest
{
    @Test
    public void testContains() throws Exception
    {
        String[] aTest = { "one", "two", "three" };
        Integer[] bTest = { 1, 2, 3 };
        Float[] cTest = { 1.0f, 2.0f, 3.0f };
        Double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertFalse( ArrayHelper.contains( aTest, "twenty" ) );
        assertFalse( ArrayHelper.contains( bTest, 20 ) );
        assertFalse( ArrayHelper.contains( cTest, 20.0f ) );
        assertFalse( ArrayHelper.contains( cTest, 20.0 ) );

        // happy
        assertTrue( ArrayHelper.contains( aTest, "two" ) );
        assertTrue( ArrayHelper.contains( bTest, 2 ) );
        assertTrue( ArrayHelper.contains( cTest, 2.0f ) );
        assertTrue( ArrayHelper.contains( dTest, 2.0 ) );
    }
}