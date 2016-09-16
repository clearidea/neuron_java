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


    /**
     * @param aData Array
     * @param Item Object to be compared
     * @return mixed
     */
    public static int indexOf( boolean[] aData, boolean Item )
    {
        Integer count = 0;
        for ( boolean obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( byte[] aData, byte Item )
    {
        Integer count = 0;
        for ( byte obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( char[] aData, char Item )
    {
        Integer count = 0;
        for ( char obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( short[] aData, short Item )
    {
        Integer count = 0;
        for ( short obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( int[] aData, int Item )
    {
        Integer count = 0;
        for ( int obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( long[] aData, long Item )
    {
        Integer count = 0;
        for ( long obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( float[] aData, float Item )
    {
        Integer count = 0;
        for ( float obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    public static int indexOf( double[] aData, double Item )
    {
        Integer count = 0;
        for ( double obj : aData )
        {
            if ( obj == Item )
                return count;

            count++;
        }

        return -1;
    }

    /**
     * Dynamically increase the size of the array
     *
     * @param aData Array to be sized
     * @param newSize Size of the new array
     * @return Array increased in size
     */
    public static boolean[] increaseArraySize( boolean[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        boolean[] aTemp = new boolean[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static byte[] increaseArraySize( byte[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        byte[] aTemp = new byte[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static char[] increaseArraySize( char[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        char[] aTemp = new char[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static short[] increaseArraySize( short[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        short[] aTemp = new short[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static int[] increaseArraySize( int[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        int[] aTemp = new int[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static long[] increaseArraySize( long[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        long[] aTemp = new long[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static float[] increaseArraySize( float[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        float[] aTemp = new float[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }

    public static double[] increaseArraySize( double[] aData, int newSize )
    {
        if (newSize < aData.length)
            return null;

        double[] aTemp = new double[newSize];

        for ( int i=0; i<aData.length; i++ )
        {
            aTemp[i] = aData[i];
        }

        return aTemp;
    }


    /**
     * @param aData Array
     * @param Item Item to be removed
     * @return boolean
     */
    public static boolean[] remove( boolean[] aData, boolean Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        boolean[] aTemp = new boolean[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static byte[] remove( byte[] aData, byte Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        byte[] aTemp = new byte[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static char[] remove( char[] aData, char Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        char[] aTemp = new char[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static short[] remove( short[] aData, short Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        short[] aTemp = new short[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static int[] remove( int[] aData, int Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        int[] aTemp = new int[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static long[] remove( long[] aData, long Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        long[] aTemp = new long[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static float[] remove( float[] aData, float Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        float[] aTemp = new float[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }

    public static double[] remove( double[] aData, double Item )
    {
        int Index = indexOf( aData, Item );

        if (Index == -1)
            return null;

        double[] aTemp = new double[aData.length - 1];
        for (int i=0; i<aData.length; i++)
        {
            if ( i < Index )
                aTemp[i] = aData[i];
            else if ( i > Index )
                aTemp[i-1] = aData[i];
        }

        return aTemp;
    }
}
