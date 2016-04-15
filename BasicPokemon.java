 

import java.util.*;

public abstract class BasicPokemon extends Pokemon
{
    
    public BasicPokemon()
    {
        super();
    }
    
    
    public BasicPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis) 
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis);
    
    }
    
    public BasicPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
    }
    
    public BasicPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
    }
    
    public BasicPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Energy> attachedE)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts, attachedE);
    }
    

}