package main.java.Patterns.Criteria;

import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class OrCriteria extends LogicBase implements ICriteria
{
    public OrCriteria( ICriteria Criteria, ICriteria OtherCriteria )
    {
        super( Criteria, OtherCriteria );
    }

    @Override
    public List<?> meetCriteria( List<?> entities )
    {
        Class<?> cls = entities.get(0).getClass();

        List<?> aFirstCriteriaItems = this._Criteria.meetCriteria( entities );
        List<?> aOtherCriteriaItems = this._OtherCriteria.meetCriteria( entities );

        for ( Object Item : aOtherCriteriaItems )
        {
            if ( !aFirstCriteriaItems.contains( Item ) )
            {
                //aFirstCriteriaItems.add( Item );
            }
        }

        return aFirstCriteriaItems;
    }
}
