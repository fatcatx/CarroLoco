import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Actor
{
    /**
     * Act - do whatever the Auto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static boolean mododios = false;
    public void act() 
    {
        
         int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("left"))
            {
                move(-5);
            }
        if (Greenfoot.isKeyDown("right"))
            {
                move(5);
            }   
            
            if (mododios == false){
                Actor a = getOneIntersectingObject(Bomba.class);
            if (a != null)
            {
                Greenfoot.stop();
            } 
            
            Actor b = getOneIntersectingObject(Pasto.class);
            if (b != null)
            {
                Greenfoot.stop();
            }}
 
        }
        
    public void setModoDios(){
     if (mododios == false){
         mododios = true;
        }else{
            mododios=false;}
        
    }
    
    public static boolean getModoDios(){
        return mododios;
    }
}
