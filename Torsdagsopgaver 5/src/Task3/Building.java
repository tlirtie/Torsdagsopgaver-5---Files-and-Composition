package Task3;

import java.util.*;

public class Building{
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(ArrayList<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
}
