

public abstract class AttackEffect extends AttributeEffect
{
    
    public void doActiveDamage(Game g)
    {
       Player opponent = g.getNonCurrentPlayer();
       Pokemon opponentActive = opponent.getActive();
       
       opponentActive.setCurrentHP(opponentActive.getCurrentHP()-getDamage(g));
       
    }
    
    public abstract int getDamage(Game g);
    
}