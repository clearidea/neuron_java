package main.java.Util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/14/16.
 */

public class DateTest
{
    static SimpleDateFormat _sdf = new SimpleDateFormat("yyyy-MM-dd");

    static Integer YEAR = 31536000;
    static Integer MONTH = 2592000;
    static Integer WEEK = 604800;
    static Integer DAY = 86400;
    static Integer HOUR = 3600;
    static Integer MINUTE = 60;
    static Integer SECOND = 1;

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testDifferenceAsText() throws Exception
    {
        // Year
        assertEquals(Date.differenceAsText( YEAR.toString(), (YEAR * 2)+"" ), "1 year");

        // Years
        assertEquals(Date.differenceAsText( YEAR.toString(), (YEAR * 3)+"" ), "2 years");

        // Month
        assertEquals(Date.differenceAsText( MONTH.toString(), (MONTH * 2)+"" ), "1 month");

        // Week
        assertEquals(Date.differenceAsText( WEEK.toString(), (WEEK * 2)+"" ), "1 week");

        // Day
        assertEquals(Date.differenceAsText( DAY.toString(), (DAY * 2)+"" ), "1 day");

        // Hour
        assertEquals(Date.differenceAsText( HOUR.toString(), (HOUR * 2)+"" ), "1 hour");

        // Minute
        assertEquals(Date.differenceAsText( MINUTE.toString(), (MINUTE * 2)+"" ), "1 minute");

        // Second
        assertEquals(Date.differenceAsText( SECOND.toString(), (SECOND * 2)+"" ), "1 second");
    }

    @Test
    public void testIsLeapYear() throws Exception
    {
        assertTrue(Date.isLeapYear( 2004 ));

        assertFalse(Date.isLeapYear( 2003 ));
    }

    @Test
    public void testGetDaysInMonth() throws Exception
    {
        assertTrue(Date.getDaysInMonth( 1, null ) == 31);

        assertTrue(Date.getDaysInMonth( 2, 2004 ) == 29);

        assertTrue(Date.getDaysInMonth( 2, 1805 ) == 28);
    }

    @Test
    public void testDiff() throws Exception
    {
        Calendar cal = Calendar.getInstance();
        java.util.Date currentDate = cal.getTime();

        cal.add(Calendar.DATE, -30);
        java.util.Date oldDate = cal.getTime();

        assertTrue( Date.diff( _sdf.format( currentDate ), _sdf.format( oldDate ) ) == 30);
    }

    @Test
    public void testSubtractDays() throws Exception
    {
        assertTrue(Date.subtractDays( 8, "2015-01-30").equals("2015-01-22") );

        assertFalse(Date.subtractDays( 8, "2015-01-30").equals("2015-01-21") );
    }

    @Test
    public void testGetCurrentMonthStartDate() throws Exception
    {

    }

    @Test
    public void testGetCurrentMonthEndDate() throws Exception
    {

    }

    @Test
    public void testIsSqlDateTime() throws Exception
    {

    }

    @Test
    public void testGetMySqlDateTime() throws Exception
    {

    }

    @Test
    public void testGetMySqlDate() throws Exception
    {

    }

    @Test
    public void testDateToJulian() throws Exception
    {

    }

    @Test
    public void testJulianToDate() throws Exception
    {

    }
}