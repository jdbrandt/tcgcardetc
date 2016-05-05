import java.util.*;
public abstract class Energy extends Card
{
    protected ArrayList<Type> type;
    

    public abstract Effect getEffect();
    
    public ArrayList<Type> getType() //while I'd love to do just Type, DCE prevents this. 
    {
        return type;
    }

    public Energy()
    {
        super();
        type = new ArrayList<Type>();
    }
    

}