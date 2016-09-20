package main.java.Patterns.Criteria;

import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class Base implements ICriteria
{
    protected ICriteria _Criteria;

    public AndCriteria _and( ICriteria OtherCriteria )
    {
        return new AndCriteria( this, OtherCriteria );
    }

    public OrCriteria _or( ICriteria OtherCriteria )
    {
        return new OrCriteria( this, OtherCriteria );
    }

    public NotCriteria _not()
    {
        return new NotCriteria( this );
    }

    @Override
    public List< KeyValue > meetCriteria( List< KeyValue > OtherCriteria )
    {
        return OtherCriteria;
    }
}
