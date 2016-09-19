package main.java.Patterns.Criteria;

import java.util.List;

/**
 * Created by jeremiah on 9/19/16.
 */
public interface ICriteria
{
    List<?> meetCriteria( List<?> entities );
}
