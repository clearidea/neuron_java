package main.java.Data;

/**
 * Created by jeremiah on 9/15/16.
 */
public class ArrayHelper
{
    /**
     * Check if Value is contained in Array
     *
     * @param aData Array
     * @param Value Value to be compared
     * @return boolean
     */
    public static boolean contains( boolean[] aData, boolean Value )
    {
        for ( boolean Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( byte[] aData, byte Value )
    {
        for ( byte Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( char[] aData, char Value )
    {
        for ( char Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( short[] aData, short Value )
    {
        for ( short Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( int[] aData, int Value )
    {
        for ( int Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( long[] aData, long Value )
    {
        for ( long Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( float[] aData, float Value )
    {
        for ( float Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( double[] aData, double Value )
    {
        for ( double Item : aData )
        {
            if ( Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( Object[] aData, Object Value )
    {
        for ( Object Item : aData )
        {
            if ( Item.equals(Value) || Item == Value )
                return true;
        }

        return false;
    }

    public static boolean contains( Object[][] aData, Object Value, Object Key )
    {
        for ( Object[] Item : aData )
        {
            if ( Item[0].equals(Key) || Item[0] == Key )
            {
                if ( Item[1].equals(Value) || Item[1] == Key )
                    return true;
            }
        }

        return false;
    }


    /**
     * @param aData Array of Collections
     * @param Key The Key
     * @param Default
     * @return mixed
     */
    public static Object getElement( Object[][] aData, Object Key, Object Default )
    {
        for ( Object[] Item : aData )
        {
            if ( Item[0].equals(Key) || Item[0] == Key )
               return Item[1];
        }

        if ( Default != null )
            return Default;

        return null;
    }


    /**
     * @param aData Array
     * @param Item Object to be compared
     * @return mixed
     */
    public static Integer indexOf( boolean[] aData, boolean Item )
    {
        Integer count = 0;
        for ( boolean obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( byte[] aData, byte Item )
    {
        Integer count = 0;
        for ( byte obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( char[] aData, char Item )
    {
        Integer count = 0;
        for ( char obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( short[] aData, short Item )
    {
        Integer count = 0;
        for ( short obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( int[] aData, int Item )
    {
        Integer count = 0;
        for ( int obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( long[] aData, long Item )
    {
        Integer count = 0;
        for ( long obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( float[] aData, float Item )
    {
        Integer count = 0;
        for ( float obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Integer indexOf( double[] aData, double Item )
    {
        Integer count = 0;
        for ( double obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Object indexOf( Object[] aData, Object Item )
    {
        Integer count = 0;
        for ( Object obj : aData )
        {
            if ( obj.equals(Item) || obj == Item )
                return count;

            count++;
        }

        return null;
    }

    public static Object indexOf( Object[][] aData, Object Item )
    {
        Integer count = 0;
        for ( Object[] obj : aData )
        {
            if ( (obj[0].equals(Item) || obj[0] == Item) || (obj[1].equals(Item) || obj[1] == Item) )
                return count;

            count++;
        }

        return false;
    }

    /**
     * @param aData Object Array
     * @param Item Object to be removed
     * @return boolean
     */
    public static boolean[] remove( boolean[] aData, boolean Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        boolean[] aTemp = new boolean[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static byte[] remove( byte[] aData, byte Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        byte[] aTemp = new byte[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static char[] remove( char[] aData, char Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        char[] aTemp = new char[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static short[] remove( short[] aData, short Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        short[] aTemp = new short[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static int[] remove( int[] aData, int Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        int[] aTemp = new int[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static long[] remove( long[] aData, long Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        long[] aTemp = new long[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static float[] remove( float[] aData, float Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        float[] aTemp = new float[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static double[] remove( double[] aData, double Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        double[] aTemp = new double[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static String[] remove( String[] aData, String Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        String[] aTemp = new String[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }
    /*
    public static Integer[] remove( Integer[] aData, Integer Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        Integer[] aTemp = new Integer[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }
    */

    public static Float[] remove( Float[] aData, Float Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        Float[] aTemp = new Float[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static Double[] remove( Double[] aData, Double Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        Double[] aTemp = new Double[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static Long[] remove( Long[] aData, Long Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        Long[] aTemp = new Long[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static Object remove( Object[] aData, Object Item, Class<?> cls )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return null;

        Object[] aTemp = new Object[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < (int)Index )
                aTemp[i] = aData[i];
            else if ( i > (int)Index )
                aTemp[i-1] = aData[i];
        }

        return cls.cast(aTemp);
    }

    /**
     * @param aData Generic array of Collections
     * @param Item Object to be removed
     * @return boolean
     */
    public static Object remove( Object[][] aData, Object Item )
    {
        Object Index = indexOf( aData, Item );

        if (Index == null)
            return false;

        Object[][] newArray = new Object[aData.length - 1][2];
        for (int i=0; i<newArray.length; i++)
        {
            if (i != (int)Index)
            {
                newArray[i][0] = aData[i][0];
                newArray[i][1] = aData[i][1];
            }
        }

        return newArray;
    }
}
