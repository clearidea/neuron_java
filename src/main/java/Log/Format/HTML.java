package main.java.Log.Format;

import main.java.Log.Data;

/**
 * Created by jeremiah on 9/16/16.
 */
public class HTML implements IFormat
{
    @Override
    public String format(Data data)
    {
        return "<small>"+ data._TimeStamp +"</small> "+ data._sLevel +" "+ data._sText +"<br>";
    }
}
