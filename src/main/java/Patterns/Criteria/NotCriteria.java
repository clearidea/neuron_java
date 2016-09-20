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
    public List< KeyValue > meetCriteria( List< KeyValue > entities )
    {
        List< KeyValue > aNotCriteriaItems = this._Criteria.meetCriteria( entities );
        List< KeyValue > aNotEntities = entities;

        for ( KeyValue Item : aNotCriteriaItems )
        {
            aNotEntities.remove( Item );
        }

        return aNotEntities;
    }
}
