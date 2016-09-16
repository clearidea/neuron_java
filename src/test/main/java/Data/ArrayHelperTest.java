package main.java.Data;

import org.junit.Test;

import java.lang.reflect.Array;
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
        int[] bTest = { 1, 2, 3 };
        float[] cTest = { 1.0f, 2.0f, 3.0f };
        double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertFalse( ArrayHelper.contains( bTest, 20 ) );
        assertFalse( ArrayHelper.contains( cTest, 20.0f ) );
        assertFalse( ArrayHelper.contains( dTest, 20.0 ) );

        // happy
        assertTrue( ArrayHelper.contains( bTest, 2 ) );
        assertTrue( ArrayHelper.contains( cTest, 2.0f ) );
        assertTrue( ArrayHelper.contains( dTest, 2.0 ) );
    }

    @Test
    public void testIndexOf()
    {
        int[] bTest = { 1, 2, 3 };
        float[] cTest = { 1.0f, 2.0f, 3.0f };
        double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertEquals( -1, ArrayHelper.indexOf( bTest, 12 ) );
        assertEquals( -1, ArrayHelper.indexOf( cTest, 12.0f ) );
        assertEquals( -1, ArrayHelper.indexOf( dTest, 12.0 ) );

        // happy
        assertEquals( 1, ArrayHelper.indexOf( bTest, 2 ) );
        assertEquals( 1, ArrayHelper.indexOf( cTest, 2.0f ) );
        assertEquals( 1, ArrayHelper.indexOf( dTest, 2.0 ) );
    }

    @Test
    public void testIncreaseArraySize()
    {
        int[] bTest = { 1, 2, 3 };
        float[] cTest = { 1.0f, 2.0f, 3.0f };
        double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertNotEquals( 3, ArrayHelper.increaseArraySize( bTest, 4 ).length );
        assertNotEquals( 3, ArrayHelper.increaseArraySize( cTest, 5 ).length );
        assertNotEquals( 3, ArrayHelper.increaseArraySize( dTest, 6 ).length );

        // happy
        assertEquals( 4, ArrayHelper.increaseArraySize( bTest, 4 ).length );
        assertEquals( 5, ArrayHelper.increaseArraySize( cTest, 5 ).length );
        assertEquals( 6, ArrayHelper.increaseArraySize( dTest, 6 ).length );
    }

    @Test
    public void testRemove()
    {
        // Test Values
        int[] bTest = { 1, 2, 3 };
        float[] cTest = { 1.0f, 2.0f, 3.0f };
        double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertNull( ArrayHelper.remove( bTest, 12 ) );
        assertNull( ArrayHelper.remove( cTest, 12.0f ) );
        assertNull( ArrayHelper.remove( dTest, 12.0 ) );

        // Remove Values
        int[] bTestResult = ArrayHelper.remove( bTest, 2 );
        float[] cTestResult = ArrayHelper.remove( cTest, 2.0f );
        double[] dTestResult = ArrayHelper.remove( dTest, 2.0 );

        // happy
        assertFalse( ArrayHelper.contains( bTestResult, 2 ) );
        assertFalse( ArrayHelper.contains( cTestResult, 2.0f ) );
        assertFalse( ArrayHelper.contains( dTestResult, 2.0 ) );
    }
}