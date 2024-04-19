import java.util.List;
import java.util.Iterator;
import java.util.Random;

/**
 * Deer - deer can reproduce once every four turns and they must be in perfect health 
 * (note, to simplify coding, we've made deer able to asexually reproduce)
 * - deer are not affected by fire
 * - each deer has health (up to a maximum of eight points - the deer starts with eight) based on eating; 
 * each turn that the deer eats (which it does whenever it can), 
 * its health goes up by one (until the maximum); 
 * if the deer has nothing to eat, its health goes down to eat - during any given move, 
 * first the deer should eat, then the deer may move 
 * (the deer moves to whatever square adjoining it has the most food, 
 * unless the square it is on has the most food); 
 * if there is no food in its own square or an adjacent square, the deer will move randomly - 
 * deer die once their health reaches zero.
 * 
 * @author Spring Java 2024 Class Project
 * @version 2024.00
 * Reference David J. Barnes and Michael Kölling, version 2016.02.29
 */
public class Deer extends Animal
{
    // Characteristics shared by all deer (class variables).
    
    // The rate of growth - 
    // deer reproduce when current step % GROWTH_RATE = 0 AND current step > 1
    private static final int GROWTH_RATE = 4;
    // The maximum number of possible deer births.
    private static final int MAX_LITTER_SIZE = 1;
    // The deer's initial health.
    private static final int MAX_HEALTH = 9;
    
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();
    
    // The deer's health, which is increased by eating grass.
    private int health;

    /**
     * Create a deer.
     * 
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Deer(Field field, Location location)
    {
        super(field, location);
        health = MAX_HEALTH;
    }
    
    /**
     * The deer eats to survive and breeds once every four turns
     * only if completely healthy.
     * @param field The field currently occupied.
     * @param newDeer A list to return newly born deer.
     */
    @Override
    public void act(List<Animal> newDeer, int step)
    {
        //TODO define deer behavior
    }
    
    /**
     * Make this deer lose health. This could result in the deer's death.
     */
    private void decrementHealth()
    {
        //TODO decrease deer health by 1, this happens if deer does not eat that step
    }
    
    /**
     * Look for plants adjacent to the current location.
     * Only the first live plant is eaten.
     * @return Where food was found, or null if it wasn't.
     */
    private Location findFood()
    {
        Field field = getField();
        List<Location> adjacent = field.adjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        
        while(it.hasNext()) {
            //TODO define deer food finding/eating behavior
        }
        return null;
    }
    
    /**
     * Check whether or not this Deer is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newDeer A list to return newly born deer.
     */
    private void giveBirth(List<Animal> newDeer)
    {
        // New deer are born into adjacent locations.
        // Get a list of adjacent free locations.
        Field field = getField();
        List<Location> free = field.getFreeAdjacentLocations(getLocation());
        //TODO define deer birth behavior
    }
        
    /**
     * Generate a number representing the number of births if it can breed.
     * @return The number of births
     */
    private int breed()
    {
        //TODO define the number of deer births
        return 1;
    }
}
