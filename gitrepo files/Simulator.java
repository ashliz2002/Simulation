import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;

/**
 * A simple ecosystem simulator, based on a 12x12 rectangular field
 * containing deer, grass and trees.
 * 
 * @author Spring Java 2024 Class Project
 * @version 2024.00
 * Reference David J. Barnes and Michael Kölling, version 2016.02.29
 */
public class Simulator
{
    // Constants representing configuration information for the simulation.
    // The default width for the grid.
    private static final int DEFAULT_WIDTH = 12;
    
    // The default depth of the grid.
    private static final int DEFAULT_DEPTH = 12;
    
    //TODO set up input for initial Deer, Grass and Trees
    
    // The current step of the simulation.
    private static int step;

    // List of animals in the field.
    private List<Animal> animals;
    // List of plants in the field.
    private List<Plant> plants;
    // The current state of the field.
    private Field field;
    // A graphical view of the simulation.
    private SimulatorView view;
    
    /**
     * Construct a simulation field with default size.
     */
    public Simulator()
    {
        this(DEFAULT_DEPTH, DEFAULT_WIDTH);
    }
    
    /**
     * Create a simulation field with the given size.
     * @param depth Depth of the field. Must be greater than zero.
     * @param width Width of the field. Must be greater than zero.
     */
    private Simulator(int depth, int width)
    {
        if(width <= 0 || depth <= 0) {
            System.out.println("The dimensions must be greater than zero.");
            System.out.println("Using default values.");
            depth = DEFAULT_DEPTH;
            width = DEFAULT_WIDTH;
        }
        
        animals = new ArrayList<>();
        plants = new ArrayList<>();
        field = new Field(depth, width);
        
        // Create a view of the state of each location in the field.
        view = new SimulatorView(depth, width);
        view.setColor(Grass.class, Color.GREEN);
        view.setColor(Tree.class, Color.CYAN);
        view.setColor(Deer.class, Color.ORANGE);
        
        // Setup a valid starting point.
        reset();
    }
    
    /**
     * Run the simulation from its current state for a reasonably long period,
     * (4000 steps).
     */
    public void runLongSimulation()
    {
        simulate(4000);
    }
    
    /**
     * Run the simulation from its current state for the given number of steps.
     * Stop before the given number of steps if it ceases to be viable.
     * @param numSteps The number of steps to run for.
     */
    public void simulate(int numSteps)
    {
        for(int step = 1; step <= numSteps && view.isViable(field); step++) {
            simulateOneStep();
            // delay(60);   // uncomment this to run more slowly
        }
    }
    
    /**
     * Run the simulation from its current state for a single step.
     * Iterate over the whole field updating the state of each
     * plant and animal.
     */
    public void simulateOneStep()
    {
        step++;
        
        //TODO update plants and animals for a single step
        
        view.showStatus(step, field);
    }
        
    /**
     * Reset the simulation to a starting position.
     */
    public void reset()
    {
        step = 0;
        animals.clear();
        populate();
        
        // Show the starting state in the view.
        view.showStatus(step, field);
    }
    
    /**
     * Randomly populate the field with trees, grass and deer.
     */
    private void populate()
    {
        Random rand = Randomizer.getRandom();
        field.clear();

        //TODO populate the field with grass, trees and deer.
    }
    
    /**
     * Pause for a given time.
     * @param millisec  The time to pause for, in milliseconds
     */
    private void delay(int millisec)
    {
        try {
            Thread.sleep(millisec);
        }
        catch (InterruptedException ie) {
            // wake up
        }
    }
}
