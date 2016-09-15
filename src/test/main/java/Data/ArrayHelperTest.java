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

    @Test
    public void testGetElement()
    {
        String[][] aTest = { { "one", "1" }, { "two", "2" }, { "three", "3" } };
        Object[][] bTest = { { "one", 1 }, { "two", 2 }, { "three", 3 } };
        Object[][] cTest = { { "one", 1.0f }, { "two", 2.0f }, { "three", 3.0f } };
        Object[][] dTest = { { "one", 1.0 }, { "two", 2.0 }, { "three", 3.0 } };

        // sad
        assertEquals( null, ArrayHelper.getElement( aTest, "five", null ) );
        assertEquals( null, ArrayHelper.getElement( bTest, "five", null ) );
        assertEquals( null, ArrayHelper.getElement( cTest, "five", null ) );
        assertEquals( null, ArrayHelper.getElement( dTest, "five", null ) );

        // happy
        assertEquals( "1", ArrayHelper.getElement( aTest, "one", null ) );
        assertEquals( 20, ArrayHelper.getElement( aTest, "five", 20 ) );

        assertEquals( 1, ArrayHelper.getElement( bTest, "one", null ) );
        assertEquals( 20, ArrayHelper.getElement( bTest, "five", 20 ) );

        assertEquals( 1.0f, ArrayHelper.getElement( cTest, "one", null ) );
        assertEquals( 20, ArrayHelper.getElement( cTest, "five", 20 ) );

        assertEquals( 1.0, ArrayHelper.getElement( dTest, "one", null ) );
        assertEquals( 20, ArrayHelper.getElement( dTest, "five", 20 ) );
    }

    @Test
    public void testIndexOf()
    {
        String[] aTest = { "one", "two", "three" };
        Integer[] bTest = { 1, 2, 3 };
        Float[] cTest = { 1.0f, 2.0f, 3.0f };
        Double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertEquals( null, ArrayHelper.indexOf( aTest, "twelve" ) );
        assertEquals( null, ArrayHelper.indexOf( bTest, "twelve" ) );
        assertEquals( null, ArrayHelper.indexOf( cTest, "twelve" ) );
        assertEquals( null, ArrayHelper.indexOf( dTest, "twelve" ) );

        // happy
        assertEquals( 1, ArrayHelper.indexOf( aTest, "two" ) );
        assertEquals( 1, ArrayHelper.indexOf( bTest, 2 ) );
        assertEquals( 1, ArrayHelper.indexOf( cTest, 2.0f ) );
        assertEquals( 1, ArrayHelper.indexOf( dTest, 2.0 ) );
    }

    @Test
    public void testRemove()
    {
        // Test Values
        String[] aTest = { "one", "two", "three" };
        Integer[] bTest = { 1, 2, 3 };
        Float[] cTest = { 1.0f, 2.0f, 3.0f };
        Double[] dTest = { 1.0, 2.0, 3.0 };

        // sad
        assertNull( ArrayHelper.remove( aTest, "twelve" ) );
        assertNull( ArrayHelper.remove( bTest, 12, Integer[].class ) );
        assertNull( ArrayHelper.remove( cTest, 12.0f ) );
        assertNull( ArrayHelper.remove( dTest, 12.0 ) );

        // Remove Values
        String[] aTestResult = ArrayHelper.remove( aTest, "two");
        Integer[] bTestResult = (Integer[])(ArrayHelper.remove( bTest, 2, Integer[].class ) );
        Float[] cTestResult = ArrayHelper.remove( cTest, 2.0f );
        Double[] dTestResult = ArrayHelper.remove( dTest, 2.0 );

        // happy
        assertFalse( ArrayHelper.contains( aTestResult, "two" ) );
        assertFalse( ArrayHelper.contains( bTestResult, 2 ) );
        assertFalse( ArrayHelper.contains( cTestResult, 2.0f ) );
        assertFalse( ArrayHelper.contains( dTestResult, 2.0 ) );
    }
}