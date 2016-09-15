package main.java.Util;

import javafx.util.Pair;
import jodd.datetime.JDateTime;

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

    static String differenceAsText( String time, String until )
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
    static boolean isLeapYear( Integer iYear )
    {
        return ( ( ( iYear % 4 ) == 0) && ( ( ( iYear % 100) != 0 ) || ( ( iYear % 400 ) == 0 ) ) );
    }

    /**
     * @param iDays
     * @param sDate
     * @return String
     */
    static String subtractDays( Integer iDays, String sDate )
    {
        if ( sDate == null || sDate.isEmpty() )
            sDate = _sdf.format(new Date());

        String[] date_parts = sDate.split("-");

        Integer year = Integer.parseInt(date_parts[0]);
        Integer month = Integer.parseInt(date_parts[1]);
        Integer day = Integer.parseInt(date_parts[2]);

        JDateTime joda = new JDateTime( year, month, day );
        joda.subDay(iDays);

        return joda.convertToSqlDate().toString().substring(0, 10);
    }

    /**
     * Returns the current month starting date.
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String getCurrentMonthStartDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar cal = Calendar.getInstance();
        java.util.Date currentdate = cal.getTime();

        String date = sdf.format(currentdate);
        date += "-1";

        return date;
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
    static Integer getDaysInMonth( Integer iMonth, Integer iYear )
    {
        Integer days = 0;

        switch ( iMonth )
        {
            case 1:
                days = 31;
                break;
            case 2:
                if ( iYear != null && isLeapYear( iYear ) )
                    days = 29;
                else
                    days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }

        return days;
    }

    /**
     * Returns the end date for the current month.
     *
     * @return A string in yyyy-mm-dd mysql format.
     */
    static String getCurrentMonthEndDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar cal = Calendar.getInstance();
        java.util.Date date = cal.getTime();
        String formattedDate = sdf.format(date);

        Integer numberOfDaysInMonth = getDaysInMonth( cal.get(Calendar.MONTH), cal.get(Calendar.YEAR) );
        formattedDate += "-" + numberOfDaysInMonth;

        return formattedDate;
    }

    static boolean isSqlDateTime( String date_time )
    {
        if ( date_time.length() == 0 )
            return false;

        char[] dateArray = date_time.toCharArray();
        return dateArray[4] == '-' ? true : false;
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
        if ( isSqlDateTime(date_time) )
            return date_time;
        else
        {
            String dt1 = date_time.substring(4, 6);
            dt1 += "-";
            dt1 += date_time.substring(2, 3);
            dt1 += "-";
            dt1 += date_time.substring(0, 2);
            dt1 += " ";
            dt1 += date_time.substring(8, 11);

            return dt1;
        }
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
        if ( isSqlDateTime(date_time) )
            return date_time;
        else
        {
            String dt1 = date_time.substring(4, 6);
            dt1 += "-";
            dt1 += date_time.substring(2, 3);
            dt1 += "-";
            dt1 += date_time.substring(0, 2);

            return dt1;
        }
    }

    /**
     * Takes a date in yyyy-mm-dd format and returns a julian format date.
     *
     * @param date A string containing the date in yyyy-mm-dd format.
     *
     * @return A string Julian date.
     */
    static String dateToJulian( String date )
    {
        String[] date_parts = date.split("-");

        Integer year = Integer.parseInt(date_parts[0]);
        Integer month = Integer.parseInt(date_parts[1]);
        Integer day = Integer.parseInt(date_parts[2]);

        JDateTime joda = new JDateTime( year, month, day );

        return joda.getJulianDate().toString();
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
        double julian_date = Double.parseDouble(date);

        JDateTime joda = new JDateTime();
        joda.setJulianDate(julian_date);

        return joda.convertToSqlDate().toString();
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
        // Start Date
        String[] start_date_parts = beginDate.split("-");

        Integer start_year = Integer.parseInt(start_date_parts[0]);
        Integer start_month = Integer.parseInt(start_date_parts[1]);
        Integer start_day = Integer.parseInt(start_date_parts[2]);

        // End Date
        String[] end_date_parts = endDate.split("-");

        Integer end_year = Integer.parseInt(end_date_parts[0]);
        Integer end_month = Integer.parseInt(end_date_parts[1]);
        Integer end_day = Integer.parseInt(end_date_parts[2]);

        // Joda Date Objects
        JDateTime start = new JDateTime( start_year, start_month, start_day );
        JDateTime end = new JDateTime( end_year, end_month, end_day );

        return start.daysBetween(end);
    }
}
