 

public abstract class SpecialEnergy extends Energy
{
    
    private Type type;
    private final Effect effect = new NullEffect();
    
    
    
    public Type getType()
    {
        return type;
    }
    
    public Effect getEffect()
    {
        return effect;
    }
    
}
