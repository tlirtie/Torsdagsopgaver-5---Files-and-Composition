package Task3;

import java.util.*;

public class Room {



    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps(){ //getters and setters for both variables
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }
}
