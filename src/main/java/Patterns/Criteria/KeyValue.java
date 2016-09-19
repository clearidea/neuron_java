package main.java.Patterns.Criteria;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class KeyValue extends Base implements ICriteria
{
    Pair<String, Object> _KVP;

    public KeyValue( String Key, Object Value )
    {
        super();
        this._KVP = new Pair<>( Key, Value );
    }

    @Override
    public List<?> meetCriteria( List<?> entites )
    {
        List< List< Pair<String, Object> > > aResults = new ArrayList<>();

        for ( List< Pair<String, Object> > container : (List< List< Pair<String, Object> > >)entites )
        {
            if ( container.get(0).getKey().equals( getKey() ) && container.get(0).getValue().equals( getValue() ) )
            {
                aResults.add( container );
            }
            else if ( container.get(1).getKey().equals( getKey() ) && container.get(1).getValue().equals( getValue() ) )
            {
                aResults.add( container );
            }
        }

        return aResults;
    }

    public String getKey()
    {
        return this._KVP.getKey();
    }

    public Object getValue()
    {
        return this._KVP.getValue();
    }
}
