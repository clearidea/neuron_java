package main.java.Patterns.Criteria;

import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jeremiah on 9/19/16.
 */
public class ICriteriaTest
{
    @Test
    public void testAndCriteria()
    {
        List< Pair<String, Object> > item1 = new ArrayList< Pair<String, Object> >()
        {{
            add( new Pair<>("name", "one") );
            add( new Pair<>("type", 1) );
        }};

        List< Pair<String, Object> > item2 = new ArrayList< Pair<String, Object> >()
        {{
            add( new Pair<>("name", "two") );
            add( new Pair<>("type", 2) );
        }};

        List< Pair<String, Object> > item3 = new ArrayList< Pair<String, Object> >()
        {{
            add( new Pair<>("name", "three") );
            add( new Pair<>("type", 1) );
        }};

        List< List<?> > aTest = new ArrayList<List<?>>()
        {{
            add( item1 );
            add( item2 );
            add( item3 );
        }};

        KeyValue MatchesOne = new KeyValue( "type", 1 );
        KeyValue MatchesTwo = new KeyValue( "name", "three" );

        List<?> aResult = MatchesOne._and( MatchesTwo ).meetCriteria( aTest );
        assertEquals( 1, aResult.size() );

        List<Pair<String, Object>> item = ((List<List<Pair<String, Object>>>)aResult).get(0);
        assertTrue( item.contains( new Pair<>( "name", "three" ) ) );
    }

    @Test
    public void testOrCriteria()
    {

    }

    @Test
    public void testNotCriteria()
    {

    }
}