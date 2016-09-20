package main.java.Patterns.Criteria;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class KeyValue extends Base implements ICriteria
{
    public String _Key;
    public Object _Value;

    public KeyValue( String Key, Object Value )
    {
        super();

        this._Key = Key;
        this._Value = Value;
    }

    @Override
    public List< KeyValue > meetCriteria( List< KeyValue > entites )
    {
        List< KeyValue > aResults = new ArrayList<>();

        for ( KeyValue container : entites )
        {
            if ( getKey() != null && container.getKey().equals( getKey() ) )
            {
                aResults.add( container );
            }
            else if ( getValue() != null && container.getValue().equals( getValue() ))
            {
                aResults.add( container );
            }
        }

        return aResults;
    }

    public String getKey()
    {
        return this._Key;
    }

    public Object getValue()
    {
        return this._Value;
    }

    public boolean hasKey( String Key )
    {
        return this._Key.equals( Key );
    }

    public Object hasValue( Object Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( boolean Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( byte Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( char Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( int Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( short Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( float Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( double Value )
    {
        return this._Value.equals( Value );
    }

    public boolean hasValue( long Value )
    {
        return this._Value.equals( Value );
    }
}
