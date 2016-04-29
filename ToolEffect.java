

public abstract class ToolEffect extends ItemEffect
{
    public ToolEffect()
    {
        super();
    }
    
    /**
     * This is meant to deprecate the old activate, as the Energy needs to know which Pokemon it has 
     * been attached to so that it may perform its effect. 
     */
    
    public abstract void activate(Game g, Pokemon p);
    
    public abstract void deactivate(Game g, Pokemon p);
}