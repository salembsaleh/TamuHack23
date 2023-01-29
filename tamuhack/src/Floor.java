import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Floor implements Comparable<Floor>{
    int capacity, remainingCapacity, floorId;
    Set<Integer> noWayList;
    Set<Integer> assignedTeamIds;


    Floor(int n){
        this();
        this.capacity = n;
        this.remainingCapacity = n;
    }

    Floor(){
        noWayList = new HashSet<Integer>();
        assignedTeamIds = new HashSet<Integer>();
    }

    public void addToNoWayList(int teamId){
        noWayList.add(teamId);
    }

    public void addSetToNoWayList(Set<Integer> teamIds){
        noWayList.addAll(teamIds);
    }

    public boolean notElligibleToConsiderInFloor(int teamId){
        return noWayList.contains(teamId);
    }

    public boolean addAssignedTeamIds(Team team){
        if ( notElligibleToConsiderInFloor(team.teamId) || (remainingCapacity<team.strength)){
            return false;
        }
        assignedTeamIds.add(team.teamId);
        remainingCapacity -= team.strength;
        addSetToNoWayList(team.noWayTeamIds);
        return true;
    }

    @Override
    public int compareTo(Floor floor) {
        // Descending Order
        return (int)(floor.capacity-this.capacity);
    }
}
