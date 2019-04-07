import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntuacion extends Greenfoot
{
    /**
     * Act - do whatever the Puntuacion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    static int score = 0;
    
    public void act() 
    {
        getScore();
    }    

    public static int getScore(){
        return score;
    }

    public static void addToScore(int x){
        score = score+x;
    }
}
