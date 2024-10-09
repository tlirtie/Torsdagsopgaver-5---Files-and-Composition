package Task3;

import java.util.*;

public class Main{
    public static void main(String[] args){



        Room room1 = new Room(4, 2);
        Room room2 = new Room(3, 1);
        Room room3 = new Room(5, 3);

        ArrayList<Room> roomList = new ArrayList<Room>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building1 = new Building(roomList, 3);
        System.out.println("Samlet antal lamper i bygningen: " + countLampsInBuilding(building1));
        System.out.println("Samlet antal vinduer i bygningen: " + countWindowsInBuilding(building1));
        System.out.println("Samlet antal rum i bygningen: " + building1.getRooms().size());
        System.out.println("Er bygningen normal? " + isNormal(building1));

        Building abnormalBuilding = new Building(roomList, 2);
        System.out.println("Er den anormale bygning normal? " + isNormal(abnormalBuilding));
    }

    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for(Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for(Room room : building.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() >= building.getRooms().size(); //if number of floors is bigger than or equal to the amount of things in the rooms arraylist, return true. else return false
    }
}
