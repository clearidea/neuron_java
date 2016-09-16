package main.java.Log;

/**
 * Created by jeremiah on 9/16/16.
 */
public class Data
{
    public String _TimeStamp;
    public String _sText;
    public int _iLevel;
    public String _sLevel;

    /**
     * @param TimeStamp
     * @param sText
     * @param iLevel
     * @param _sLevel
     */
    public Data( String TimeStamp, String sText, int iLevel, String _sLevel )
    {
        this._TimeStamp = TimeStamp;
        this._sText = sText;
        this._iLevel = iLevel;
        this._sLevel = _sLevel;
    }
}
