package main.java.Log.Format;

import main.java.Log.Data;

/**
 * Created by jeremiah on 9/16/16.
 */
public class CSV implements IFormat
{
    @Override
    public String format(Data data)
    {
        return data._TimeStamp +","+ data._sLevel +","+ data._sText;
    }
}
