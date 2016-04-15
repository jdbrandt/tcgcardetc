import java.util.*;
public abstract class Energy extends Card
{
    public abstract Effect getEffect();
    
    public abstract ArrayList<Type> getType(); //while I'd love to do just Type, DCE prevents this. 
    
}