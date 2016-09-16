package main.java.Log.Format;

import main.java.Log.Data;
import org.json.simple.JSONObject;

/**
 * Created by jeremiah on 9/16/16.
 */
public class JSON implements IFormat
{
    @Override
    public String format(Data data)
    {
        JSONObject aData = new JSONObject();
        aData.put( "date", data._TimeStamp );
        aData.put( "level", data._sLevel );
        aData.put( "text", data._sText );

        return aData.toJSONString();
    }
}
