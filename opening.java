import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class opening extends World
{

    /**
     * Constructor for objects of class opening.
     * 
     */
    public opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    public void act(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new b1());
            
        }
    }
}
