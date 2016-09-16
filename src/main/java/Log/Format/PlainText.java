package main.java.Log.Format;

import main.java.Log.Data;

/**
 * Created by jeremiah on 9/16/16.
 */
public class PlainText implements IFormat
{
    private boolean _bShowDate = true;

    public PlainText( boolean bShowDate )
    {
        this._bShowDate = bShowDate;
    }

    @Override
    public String format(Data data)
    {
        String output = "";

        if ( this._bShowDate )
        {
            output += data._TimeStamp;
        }

        return output +" ["+ data._sLevel +"] "+ data._sText;
    }
}
