package main.java.Data;

/**
 * Created by jeremiah on 9/15/16.
 */
public class ArrayHelper
{
    /**
     * @param aData Generic Object array
     * @param Value Value to be compared
     * @return boolean
     */
    public static boolean contains(Object[] aData, Object Value )
    {
        for ( Object Item : aData )
        {
            if ( Item.equals(Value) )
                return true;
        }

        return false;
    }

    /**
     * @param aData Generic 2D Object array
     * @param Value Value to be compared
     * @return boolean
     */
    public static boolean contains(Object[][] aData, Object Value, Object Key )
    {
        for ( Object[] Item : aData )
        {
            if ( Item[0].equals(Key) )
            {
                if ( Item[1].equals(Value) )
                    return true;
            }
        }

        return false;
    }

    /**
     * @param aData Generic 2D Object Array
     * @param sKey The Key
     * @param Default
     * @return
     */
    public static Object getElement( Object[][] aData, String sKey, Object Default )
    {
        for ( Object[] Item : aData )
        {
            if ( Item[0].equals(sKey) )
            {
               return Item[1];
            }
        }

        if ( Default != null)
            return Default;

        return null;
    }

    public static Object indexOf( Object[] aData, Object Item )
    {



        return false;
    }


}
