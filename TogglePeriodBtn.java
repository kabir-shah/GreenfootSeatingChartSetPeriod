import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TogglePeriodBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TogglePeriodBtn extends Actor
{
    private int currentPeriod;
    
    public TogglePeriodBtn() {
        currentPeriod = 3;
        setImage("images/period3.jpg");
    }
    
    public int getCurrentPeriod() {
    	return currentPeriod;
    }
    
    public void act() {
        if (Greenfoot.mousePressed(this)) {
        	if (currentPeriod == 3) {
                	currentPeriod = 2;
                	setImage("images/period2.jpg");
        	}
        	else {
        		currentPeriod = 3;
        		setImage("images/period3.jpg");
        	}
        	((Classroom) getWorld()).setPeriod(currentPeriod);
        }
    }

}
