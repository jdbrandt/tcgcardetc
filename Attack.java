import java.util.*;

public abstract class Attack extends Attribute
{
    protected ArrayList<Type> requirements; 
    
    
    public Attack()
    {
        super();
        requirements = new ArrayList<Type>();
    }
    
    

    
}