import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AllocateTeamsToFloors {
    public static void allocateTeamsToFloors(Floor[] floors, Team[] teams){
        Arrays.sort(floors);
        Arrays.sort(teams);
        Set<Integer> available = new HashSet<Integer>();
        Set<Integer> assigned = new HashSet<Integer>();
        for (int i=0;i< teams.length; i++){
            available.add(i);
        }
//        System.out.println("Check 1");
        int teamId = 0;
        for (Floor floor : floors) {
            while ((teamId<teams.length) &&(floor.remainingCapacity < teams[teamId].strength)) {
                teamId++;
            }
            if(teamId>=teams.length){
                break;
            }
            boolean res = floor.addAssignedTeamIds(teams[teamId]);
            if (res){
                available.remove(teamId);
                assigned.add(teamId);
            }
            teamId++;
        }
//        int iteratingAvailableSet = 0;
//        for(int i=0;i<floors.length;i++){
//            while (floors[i].remainingCapacity < teams[available.].strength) {
//                teamId++;
//            }
//            if(teamId>teams.length){
//                break;
//            }
//            floors[i].addAssignedTeamIds(teams[teamId]);
//            available.remove(teamId);
//            teamId++;
//        }
//        System.out.println("Check 2");
        boolean flag = true;
        while(flag){
//            System.out.println("Check 3");
            for(Integer availableTeamId : available){

                for (int i=0;i< floors.length;i++){
//                if (floors[i].remainingCapacity > teams[availableTeamId].strength) {
//
//                }
                    boolean res = floors[i].addAssignedTeamIds(teams[availableTeamId]);
                    if(res){
                        assigned.add(availableTeamId);
                        break;
                    }
                }
            }
            if(assigned.size()+available.size()==teams.length){
                flag = false;
            }
//            System.out.println(assigned.size());
//            System.out.println(available.size());
//            System.out.println(flag);
            available.removeAll(assigned);
//            for (int id: assigned){
//                System.out.println(id);
//            }
//            System.out.println("Check 4");
//            for (int id: available){
//                System.out.println(id);
//            }
//            System.out.println(available.size());
        }
//        System.out.println("Check 5");

        // partial filling
//        for(Integer availableTeamId: available){
//            for (int i=0;i< floors.length;i++){
//
//            }
//        }

        for (Floor floor: floors){
            System.out.println("Floor "+floor.floorId+" left with "+floor.remainingCapacity+" of "+floor.capacity);
            System.out.println("Assigned Ids:");
            for (int id: floor.assignedTeamIds){
                System.out.println(id);
            }
        }
    }
}
