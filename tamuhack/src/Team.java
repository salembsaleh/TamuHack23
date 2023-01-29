import java.util.HashSet;
import java.util.Set;

public class Team implements Comparable<Team>{
    int strength, teamId, remainingStrength;
    Set<Integer> prefferedTeamIds;
    Set<Integer> toleratedTeamIds;
    Set<Integer> noWayTeamIds;

    Team(){
        prefferedTeamIds = new HashSet<Integer>();
        toleratedTeamIds = new HashSet<Integer>();
        noWayTeamIds = new HashSet<Integer>();
    }

    Team(int n){
        this();
        this.strength = n;
    }

    public void addToPrefferedTeamIds(int teamId){
        prefferedTeamIds.add(teamId);
    }

    public void addSetToPrefferedTeamIds(Set<Integer> teamIds){
        prefferedTeamIds.addAll(teamIds);
    }

    public void addToToleratedTeamIds(int teamId){
        toleratedTeamIds.add(teamId);
    }

    public void addSetToToleratedTeamIds(Set<Integer> teamIds){
        toleratedTeamIds.addAll(teamIds);
    }

    public void addToNoWayTeamIds(int teamId){
        noWayTeamIds.add(teamId);
    }

    public void addSetToNoWayTeamIds(Set<Integer> teamIds){
        noWayTeamIds.addAll(teamIds);
    }

    public Set<Integer> getPrefferedTeamIds() {
        return prefferedTeamIds;
    }

    public Set<Integer> getToleratedTeamIds() {
        return toleratedTeamIds;
    }

    public Set<Integer> getNoWayTeamIds() {
        return noWayTeamIds;
    }

    public boolean elligibleToConsider(int teamId){
        return !noWayTeamIds.contains(teamId);
    }

    public void updateNoWayInBoth(Team[] teams){
        for(Integer id: noWayTeamIds){
            teams[id].addToNoWayTeamIds(this.teamId);
        }
    }

    @Override
    public int compareTo(Team team) {
        // Descending Order
        return (int)(team.strength-this.strength);
    }
}
