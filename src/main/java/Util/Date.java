package main.java.Util;

import javafx.util.Pair;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Created by jeremiah on 9/14/16.
 */

public class Date
{
    static SimpleDateFormat _sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Turns a time difference into a text format.
     *
     * @param time
     * @param until
     * @return string
     */

    static String differenceAsText(String time, String until)
    {
        if (until == null)
        {
            until = ZonedDateTime.now().toString();
        }

        time = ( Double.parseDouble(until) - Double.parseDouble(time) ) +"";
        time = ( Double.parseDouble(time) < 1 ) ? "1" : time;

        List<Pair<Double, String>> tokens = new ArrayList<>();
        tokens.add(new Pair<>(31536000.0, "year"));
        tokens.add(new Pair<>(2592000.0, "month"));
        tokens.add(new Pair<>(604800.0, "week"));
        tokens.add(new Pair<>(86400.0, "day"));
        tokens.add(new Pair<>(3600.0, "hour"));
        tokens.add(new Pair<>(60.0, "minute"));
        tokens.add(new Pair<>(1.0, "second"));

        for (Pair<Double, String> unit : tokens)
        {
            if ( Double.parseDouble(time) < unit.getKey() )
            {
                // Skip Iteration
            }
            else
            {
                Double numberOfUnits = Math.floor( Double.parseDouble(time) / unit.getKey() );
                return numberOfUnits.intValue() +" "+unit.getValue()+(  (numberOfUnits > 1) ? 's' : "" );
            }
        }

        return null;
    }

    /**
     * @param iYear
     * @return boolean
     */
    static boolean isLeapYear(Integer iYear)
    {
        //return ( ( ( iYear % 4 ) == 0) && ( ( ( iYear % 100) != 0 ) || ( ( iYear % 400 ) == 0 ) ) );
        return false;
    }

    /**
     * @param iDays
     * @param sDate
     * @return String
     */
    static String subtractDays( Integer iDays, String sDate)
    {
        /*
        if ( sDate == null || sDate.isEmpty())
        {
            sDate = _sdf.format(new Date());
        }

        */
        return "";

    }

    /**
     * Returns the current month starting date.
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String getCurrentMonthStartDate()
    {
        return "";
    }

    /**
     * Returns the number of days in the specified month.
     * Being as it doesn't take the year as a parameter, it can't handle
     * leap year.
     *
     * @param iMonth The month number - 1-12
     * @param iYear
     *
     * @return 1-31
     */
    static Integer getDaysInMonth( Integer iMonth, Integer iYear)
    {
        return 0;
    }

    /**
     * Returns the end date for the current month.
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String getCurrentMonthEndDate()
    {
        return "";
    }

    static boolean isSqlDateTime( String date_time )
    {
        return false;
    }

    /**
     * Takes a date/time string in dd-mm-yyyy format and returns it in
     * yyyy-mm-dd format.
     *
     * @param date_time A string containing the date/time in dd-mm-yyyy ttt.. format.
     *
     * @return A string in yyyy-mm-dd tt... mysql format.
     */
    static String getMySqlDateTime( String date_time )
    {
        return "";
    }

    /**
     * Takes a date in dd-mm-yyyy format and returns it in yyyy-mm-dd format.
     *
     * @param date_time A string containing the date in dd-mm-yyyy format.
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String getMySqlDate( String date_time )
    {
        return "";
    }

    /**
     * Takes a date in dd-mm-yyyy format and returns a julian format date.
     *
     * @param date A string containing the date in dd-mm-yyyy format.
     *
     * @return A string Julian date.
     */
    static String dateToJulian( String date )
    {
        return "";
    }

    /**
     * Takes a date in julian format and returns it in yyyy-mm-dd format.
     *
     * @param date A julian date
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String julianToDate( String date )
    {
        return "";
    }

    /**
     * Computes the difference between two dates.
     *
     * @param endDate The end of the date range.
     * @param beginDate The beginning of the date range.
     *
     * @return The difference between the two dates in days.
     */
    static Integer diff( String endDate, String beginDate )
    {
        return 0;
    }
}
