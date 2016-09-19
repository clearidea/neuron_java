package main.java.Patterns.Criteria;

import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public class NotCriteria implements ICriteria
{
    private ICriteria _Criteria;

    public NotCriteria( ICriteria Criteria )
    {
        this._Criteria = Criteria;
    }

    @Override
    public List<?> meetCriteria( List<?> entities )
    {
        List<?> aNotCriteriaItems = this._Criteria.meetCriteria( entities );
        List<?> aNotEntities = entities;

        for ( Object Item : aNotCriteriaItems )
        {
            aNotEntities.remove( Item );
        }

        return aNotEntities;
    }
}
