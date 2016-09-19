package main.java.Patterns.Criteria;

import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class AndCriteria extends LogicBase implements ICriteria
{
    public AndCriteria( ICriteria Criteria, ICriteria OtherCriteria )
    {
        super( Criteria, OtherCriteria );
    }

    @Override
    public List<?> meetCriteria( List<?> entities )
    {
        List<?> result = this._Criteria.meetCriteria( entities );

        if ( result.isEmpty() )
            return result;

        return this._OtherCriteria.meetCriteria( result );
    }
}
