package main.java.Patterns.Criteria;

/**
 * Created by jeremiah on 9/19/16.
 */
public class LogicBase extends Base
{
    protected ICriteria _OtherCriteria;

    public LogicBase( ICriteria Criteria, ICriteria OtherCriteria )
    {
        this._Criteria = Criteria;
        this._OtherCriteria = OtherCriteria;
    }
}
