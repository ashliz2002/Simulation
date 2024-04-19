import java.util.List;
import java.util.Iterator;
import java.util.Random;

/**
 * Trees - each tree can produce a new tree every five turns
 * - it reproduces in its own square or in an adjacent square
 * - it never ages - it only dies through a fire
 * - you can have a maximum of ten units of vegetable material 
 * (that is, grass and trees combined) on any given square
 * - if a tree wants to spread in a particular direction, 
 * it can eliminate the grass that is in that square if necessary 
 * to avoid violating the ten vegetable unit limitation
 * - in the event of a fire, any unit of grass has a 60% chance of dying.
 * 
 * @author Spring Java 2024 Class Project
 * @version 2024.00
 * Reference David J. Barnes and Michael Kölling, version 2016.02.29
 */
public class Tree extends Plant
{
    // Characteristics shared by all grass (class variables).
    
    // The rate of growth 
    // - trees grow when current step % GROWTH_RATE = 0 AND current step > 1
    private static final int GROWTH_RATE = 5;
    
    // A shared random number generator to control growth.
    private static final Random rand = Randomizer.getRandom();
    
    // Individual characteristics (instance fields).
    private boolean isOnFire;

    /**
     * Create a Tree.
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Tree(Field field, Location location)
    {
        super(field, location);
        isOnFire = getLocation().isOnFire();
    }
    
    /**
     * Trees grow, producing a new tree every five turns.
     * @param field The field currently occupied.
     * @param newTrees A list to return newly born tree(s).
     */
    public void exist(List<Plant> newTrees, int currentStep)
    {
        if(isAlive()) {
            //TODO define Tree behavior, call grow method
        }
    }
    
    /**
     * Check whether or not this tree will reproduce at this step.
     * New trees will grow into free adjacent locations.
     * @param newTrees A list to return new tree growth.
     */
    private void grow(List<Plant> newTrees)
    {
        //TODO define Tree growth behavior
    }
}
