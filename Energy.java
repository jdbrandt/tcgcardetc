import java.util.*;
public abstract class Energy extends Card
{
    protected ArrayList<Type> type;
    
<<<<<<< HEAD
    public abstract Effect getEffect();
    
    public ArrayList<Type> getType() //while I'd love to do just Type, DCE prevents this. 
    {
        return type;
    }
=======
    public Energy()
    {
        super();
        type = new ArrayList<Type>();
    }
    
    public abstract Effect getEffect();
>>>>>>> origin/master
    
    public ArrayList<Type> getType()//while I'd love to do just Type, DCE prevents this. 
    {
        return type;
    }
}