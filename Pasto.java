import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pasto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasto extends Actor
{
    /**
     * Act - do whatever the Pasto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int pasx = getX();
        int pasy = getY();
        
        int speed = Via2.getSpeed();
        
        pasy = pasy+speed;
        setLocation(pasx, pasy);
        
        if (getY() >= 399) {
               setLocation(pasx, 0);
            }
    }    
}
