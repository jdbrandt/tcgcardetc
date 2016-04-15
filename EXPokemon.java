 
import java.util.*;

public abstract class EXPokemon extends BasicPokemon
{
    
    public EXPokemon()
    {
        super();
    }
    
    public EXPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis) 
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis);
    
    }
    
    public EXPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
    }
    
    public EXPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
    }
    
    public EXPokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Energy> attachedE)
    {
        super(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts, attachedE);
    }
    

}