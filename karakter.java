import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class karakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class karakter extends Actor
{
    private GreenfootImage r1 = new GreenfootImage("right1.png");
    private GreenfootImage r2 = new GreenfootImage("right2.png");
    private GreenfootImage r3 = new GreenfootImage("right3.png");
    private GreenfootImage l1 = new GreenfootImage("left1.png");
    private GreenfootImage l2 = new GreenfootImage("left2.png");
    private GreenfootImage l3 = new GreenfootImage("left3.png");
    private GreenfootImage u1 = new GreenfootImage("up1.png");
    private GreenfootImage u2 = new GreenfootImage("up2.png");
    private GreenfootImage u3 = new GreenfootImage("up3.png");
    private GreenfootImage d1 = new GreenfootImage("down1.png");
    private GreenfootImage d2 = new GreenfootImage("down2.png");
    private GreenfootImage d3 = new GreenfootImage("down3.png");
    private int frame_r = 1;
    private int frame_l = 1;
    private int frame_u = 1;
    private int frame_d = 1;
    private int animasi = 0;
    private static int nyawa = 0;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 2;
    public void act() 
    {
        //showText("Cahyo",getWidth()/2,350);
        jalan();
        animasi++;
    }
    public void jalan(){
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left"))
        {
            moveNo();
        }else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right"))
        {
            moveNo();
        }else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            moveNo();
        }else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
        {
            moveNo();
        }else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("down"))
        {
            moveNo();
        }else if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("right"))
        {
            moveNo();
        }else
        {
            if(Greenfoot.isKeyDown("right"))
            {
                 moveRight();
            }
            if(Greenfoot.isKeyDown("left"))
            {
                 moveLeft();
            }
            if(Greenfoot.isKeyDown("up"))
            {
                    moveUp();
            }
            if(Greenfoot.isKeyDown("down"))
            {
                moveDown();
            }
            if(isTouching(lvl1.class)){
                Greenfoot.setWorld(new b2());
            }
            if(isTouching(lvl2.class)){
                Greenfoot.setWorld(new b3());
            }
            if(isTouching(nyawa.class)){
                nyawa+=1;
            }
        }
    }
    public void moveNo()
    {
        move(0);
        
    }
    public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animasi % 4 == 0)
        animateRight();
        if(isTouching(pagar.class))
        {
            setLocation(getX()-speed, getY());
        }
       
        
    }
    public void moveLeft()
    {
        setLocation(getX()-speed, getY());
        if(animasi % 4 == 0)
        animateLeft();
        if(isTouching(pagar.class))
        {
            setLocation(getX()+speed, getY());
        }
    }
    public void moveUp()
    {
        setLocation(getX(), getY()-speed);
        if(animasi % 4 == 0)
        animateUp();
        if(isTouching(pagar.class))
        {
            setLocation(getX(), getY()+speed);
        }
       
    }
    public void moveDown()
    {
        setLocation(getX(), getY()+speed);
        if(animasi % 4 == 0)
        animateDown();
        if(isTouching(pagar.class))
        {
            setLocation(getX(), getY()-speed);
        }
    }
        public void animateRight()
    {
        if(frame_r == 1)
        {
            setImage(r1);
        }
        else if(frame_r == 2)
        {
            setImage(r2);
        }
        else if(frame_r == 3)
        {
            setImage(r3);
            frame_r = 1;
            
            return;
        }
        frame_r ++;
    }
    public void animateLeft()
    {
        if(frame_l == 1)
        {
            setImage(l1);
        }
        else if(frame_l == 2)
        {
            setImage(l2);
        }
        else if(frame_l == 3)
        {
            setImage(l3);
            frame_l = 1;
            
            return;
        }
        frame_l ++;
    } 
    public void animateUp()
    {
        if(frame_u == 1)
        {
            setImage(u1);
        }
        else if(frame_u == 2)
        {
            setImage(u2);
        }
        else if(frame_u == 3)
        {
            setImage(u3);
            frame_u = 1;
            
            return;
        }
        frame_u ++;
    }
    public void animateDown()
    {
        if(frame_d == 1)
        {
            setImage(d1);
        }
        else if(frame_d == 2)
        {
            setImage(d2);
        }
        else if(frame_d == 3)
        {
            setImage(d3);
            frame_d = 1;
            
            return;
        }
        frame_d ++;
    }
    public void nyawa(){
      
    }
}
