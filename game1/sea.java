// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class sea extends World
{

    /**
     * Constructor for objects of class sea.
     */
    public sea()
    {
        super(600, 400, 1);
        setPaintOrder(Food.class, Fish.class);
        prepare();
    }

    /**
     * 
     */
    public void populate()
    {
        addObject( new Food(), 2, 4);
        randomFood(20);
    }

    /**
     * 
     */
    public void randomFood(int howMany)
    {
        int i = 0;
        while (i < howMany) {
            Food Food =  new Food();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(Food, x, y);
            i = i + 1;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish =  new Fish();
        addObject(fish, 215, 234);
        randomFood(10);
        atacker atacker =  new atacker();
        addObject(atacker, 102, 71);
    }
}
