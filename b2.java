import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class b2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class b2 extends World
{

    /**
     * Constructor for objects of class b2.
     * 
     */
    public b2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pg3 pg3 = new pg3();
        addObject(pg3,54,494);
        pg3.setLocation(18,520);
        pg3 pg32 = new pg3();
        addObject(pg32,59,326);
        pg32.setLocation(19,358);
        pg3 pg33 = new pg3();
        addObject(pg33,27,88);
        pg33.setLocation(21,81);
        pg2 pg2 = new pg2();
        addObject(pg2,89,28);
        pg2.setLocation(80,20);
        pg2 pg22 = new pg2();
        addObject(pg22,191,46);
        pg22.setLocation(161,20);
        pg3 pg34 = new pg3();
        addObject(pg34,146,210);
        pg34.setLocation(142,201);
        pg3 pg35 = new pg3();
        addObject(pg35,149,369);
        pg35.setLocation(142,362);
        pg2 pg23 = new pg2();
        addObject(pg23,250,33);
        pg23.setLocation(242,20);
        pg3 pg36 = new pg3();
        addObject(pg36,272,129);
        pg36.setLocation(264,120);
        pg2 pg24 = new pg2();
        addObject(pg24,128,564);
        pg24.setLocation(77,581);
        pg2 pg25 = new pg2();
        addObject(pg25,183,588);
        pg25.setLocation(158,582);
        pg25.setLocation(158,581);
        pg4 pg4 = new pg4();
        addObject(pg4,213,469);
        pg4.setLocation(202,464);
        pg4.setLocation(202,463);
        pg3 pg37 = new pg3();
        addObject(pg37,310,408);
        pg37.setLocation(302,402);
        pg2 pg26 = new pg2();
        addObject(pg26,293,228);
        pg26.setLocation(284,220);
    }
}
