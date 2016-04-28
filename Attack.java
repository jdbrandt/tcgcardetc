import java.util.*;

public abstract class Attack extends Attribute
{
    protected ArrayList<Type> requirements; 
    protected final ArrayList<Type> originalRequirements;
    
    public Attack()
    {
        super();
        requirements = new ArrayList<Type>();
        originalRequirements = new ArrayList<Type>();
    }
    
    
    protected void cloneOriginal()
    {
        for (Type t : requirements)
        {
            originalRequirements.add(t);
        }
    }
    
}