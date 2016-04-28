import java.util.*;

public abstract class Attack extends Attribute
{
    protected ArrayList<Type> requirements; 
    
    
    public Attack()
    {
        super();
        requirements = new ArrayList<Type>();
    }
    
    public ArrayList<Type> getRequirements()
    {
        return requirements;
    }
    
    public void setRequirements(ArrayList<Type> reqs)
    {
        requirements = reqs;
    }
    

    
}