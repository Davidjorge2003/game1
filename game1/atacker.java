// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class atacker extends Actor
{

    /**
     * Act - do whatever the atacker wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 50) {
            turn(1);
        }
        move(5);
        if (isTouching(Fish.class)) {
            removeTouching(Fish.class);
            Greenfoot.playSound("bruh.wav");
            Greenfoot.stop();
        }
        if (isAtEdge()) {
            turn(50);
        }
    }
}
