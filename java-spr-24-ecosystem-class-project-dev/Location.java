import java.util.Random;

/**
 * Represent a location in a rectangular grid.
 * 
 * @author Spring Java 2024 Class Project
 * @version 2024.00
 * Reference David J. Barnes and Michael Kölling, version 2016.02.29
 */
public class Location
{
    // Row and column positions.
    private int row;
    private int col;
    
    // A shared random number generator to check fire status.
    private static final Random rand = Randomizer.getRandom();
    
    //probability of fire 
    //TODO verify how we check for fire && probability of fire.
    private static final double FIRE_PROBABILITY = 0.05;
    
    /**
     * Represent a row and column.
     * @param row The row.
     * @param col The column.
     */
    public Location(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    /**
     * Implement content equality.
     */
    public boolean equals(Object obj)
    {
        if(obj instanceof Location) {
            Location other = (Location) obj;
            return row == other.getRow() && col == other.getCol();
        }
        else {
            return false;
        }
    }
    
    /**
     * Return a string of the form row,column
     * @return A string representation of the location.
     */
    public String toString()
    {
        return row + "," + col;
    }
    
    /**
     * Use the top 16 bits for the row value and the bottom for
     * the column. Except for very big grids, this should give a
     * unique hash code for each (row, col) pair.
     * @return A hashcode for the location.
     */
    public int hashCode()
    {
        return (row << 16) + col;
    }
    
    /**
     * @return The row.
     */
    public int getRow()
    {
        return row;
    }
    
    /**
     * @return The column.
     */
    public int getCol()
    {
        return col;
    }
    
    /**
     * @return Determine if a location is on fire
     */
    public boolean isOnFire()
    {
        //TODO define behavior to determine if a location is on fire
        return false;
    }
}
