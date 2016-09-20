package main.java.Patterns.Criteria;

import org.junit.Test;

import java.security.Key;
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
        KeyValue item1 = new KeyValue( "one", 1 );
        KeyValue item2 = new KeyValue( "two", 2 );
        KeyValue item3 = new KeyValue( "three", 1 );

        List< KeyValue > aTest = new ArrayList<>();
        aTest.add( item1 );
        aTest.add( item2 );
        aTest.add( item3 );

        KeyValue MatchesOne = new KeyValue( null, 1 );
        KeyValue MatchesTwo = new KeyValue( "three", null );

        List< KeyValue > aResult = MatchesOne._and( MatchesTwo ).meetCriteria( aTest );
        assertEquals( 1, aResult.size() );

        KeyValue item = aResult.get(0);
        assertTrue( item.hasKey( "three" ) );
    }

    @Test
    public void testOrCriteria()
    {
        KeyValue item1 = new KeyValue( "one", 1 );
        KeyValue item2 = new KeyValue( "two", 2 );
        KeyValue item3 = new KeyValue( "three", 3 );

        List< KeyValue > aTest = new ArrayList<>();
        aTest.add( item1 );
        aTest.add( item2 );
        aTest.add( item3 );

        KeyValue MatchesOne = new KeyValue( null, 1 );
        KeyValue MatchesTwo = new KeyValue( "three", null );

        List< KeyValue > aResult = MatchesOne._or( MatchesTwo ).meetCriteria( aTest );
        assertEquals( 2, aResult.size() );

        KeyValue result1 = aResult.get(0);
        assertTrue( result1.hasValue(1) );

        KeyValue result2 = aResult.get(1);
        assertTrue( result2.hasKey("three") );
    }

    @Test
    public void testNotCriteria()
    {
        KeyValue item1 = new KeyValue( "one", 1 );
        KeyValue item2 = new KeyValue( "two", 2 );
        KeyValue item3 = new KeyValue( "Fred", 1 );

        List< KeyValue > aTest = new ArrayList<>();
        aTest.add( item1 );
        aTest.add( item2 );
        aTest.add( item3 );

        KeyValue MatchesOne = new KeyValue( null, 1 );
        KeyValue MatchesFred = new KeyValue( "Fred", null );

        List< KeyValue > aResult = MatchesOne._and( MatchesFred._not() ).meetCriteria( aTest );
        assertEquals( 1, aResult.size() );

        KeyValue item = aResult.get(0);
        assertTrue( item.hasKey( "one" ) );
        assertFalse( item.hasKey( "Fred" ) );
    }
}