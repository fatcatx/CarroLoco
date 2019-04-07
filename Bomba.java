import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int bombx = getX();
        int bomby = getY();
        turn(Via2.getSpeed()+5);
        int speed = Via2.getSpeed();
           bomby = bomby+speed+Greenfoot.getRandomNumber(1);
           setLocation(bombx, bomby);
           
           if (getY() >= 370) {
               bombx = Via2.limiteViaX(Greenfoot.getRandomNumber(5));
               bomby = Greenfoot.getRandomNumber(25);
               setLocation(bombx, bomby);
               Puntuacion.addToScore(1);
               Via2.setBombasCaidas();
               Via2.setDistribucion();
            } 
            

    }
}
