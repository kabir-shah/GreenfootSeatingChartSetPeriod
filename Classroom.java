import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
/**
 * Sets the size of the world and creates the students
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.

        super(10, 6, 130);

        prepare();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

     private void prepare()
    {
        KabirShah kabirShah = new KabirShah("Kabir", "Shah", 1, 1, 3);
        addObject(kabirShah, 1, 1);
        kabirShah.sitDown();

        OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 1, 2, 3);
        addObject(olegbychenkov, 1, 2);
        olegbychenkov.sitDown();

        RohanGovindarajan rohangovindarajan = new RohanGovindarajan("rohan", "govindarajan", 3, 2, 3);
        addObject(rohangovindarajan, 3, 2);
        rohangovindarajan.sitDown();
        
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 4, 1, 2);
        addObject(tanishbaranwal, 4, 1);
        tanishbaranwal.sitDown();
  
        ShaanMathur shaanmathur = new ShaanMathur("Shaan", "Mathur", 2, 1, 2);
        addObject(shaanmathur, 2, 1);
        shaanmathur.sitDown();
        
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2, 3);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();
    }
}
