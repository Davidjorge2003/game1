// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Food extends Actor
{

    /**
     * Act - do whatever the Food wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        turn(1);
        if (isAtEdge()) {
            turn(20);
        }
    }
}
