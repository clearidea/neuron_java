package main.java.Util;

/**
 * Created by jeremiah on 9/15/16.
 */
public class Timer
{
    private Integer _StartTime = 0;
    private Integer _StopTime = 0;

    /**
     * Timer Constructor
     *
     * @param iTime int iTime used for testing purposes.
     */
    public Timer( Integer iTime )
    {
        _StopTime = iTime;
    }

    /**
     * Start the Timer
     */
    public void start()
    {
        Long start_milli = System.currentTimeMillis();
        _StartTime = (int)(start_milli / 1000);
    }

    /**
     * Stop the Timer
     */
    public void stop()
    {
        Long stop_milli = System.currentTimeMillis();
        _StopTime = (int)(stop_milli / 1000);
    }

    /**
     * @return int Number of seconds elapsed
     */
    public Integer getElapsed()
    {
        return _StopTime - _StartTime;
    }
}
