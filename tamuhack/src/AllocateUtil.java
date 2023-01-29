import java.util.*;

public class AllocateUtil {
    public static void main(String[] args) {

//        List<Integer> capacity = new ArrayList<Integer>();
//        Scanner sc = new Scanner(System.in);

        // Setting floors
//        System.out.println("Enter floors capacity");
//        int numberOfFloors = sc.nextInt();
//        Floor[] floors = new Floor[numberOfFloors];
        // Taking input
//        for (int i =0; i<numberOfFloors;i++){
//            floors[i].capacity = sc.nextInt();
//            floors[i].remainingCapacity = floors[i].capacity;
//            floors[i].floorId = i;
//        }

        Floor[] floors = new Floor[5];
        floors[0] = new Floor(43);
        floors[0].floorId = 0;
//        floors[0].capacity = 43;
//        floors[0].remainingCapacity = 43;

        floors[1] = new Floor(81);
        floors[1].floorId = 1;
//        floors[1].capacity = 81;
//        floors[1].remainingCapacity = 81;

        floors[2] = new Floor(73);
        floors[2].floorId = 2;
//        floors[2].capacity = 73;
//        floors[2].remainingCapacity = 73;

        floors[3] = new Floor(54);
        floors[3].floorId = 3;
//        floors[3].capacity = 54;
//        floors[3].remainingCapacity = 54;

        floors[4] = new Floor(97);
        floors[4].floorId = 4;
//        floors[4].capacity = 97;
//        floors[4].remainingCapacity = 97;

        // Setting teams
        //Taking input
//        System.out.println("Enter number of teams");
//        int numberOfTeams = sc.nextInt();
//
//        Team[] teams = new Team[numberOfTeams];
//        for(int i=0;i<numberOfTeams;i++){
//            System.out.println("Enter teams strength");
//            teams[i].strength = sc.nextInt();
//            teams[i].remainingStrength = teams[i].strength;
//            teams[i].teamId = i;
//            String[] val = {"preferred", "tolerated", "noWay"};
//            for (int k=0;k<val.length;k++){
//                System.out.println("Enter teams "+val[k]+" list length");
//                int listCount = sc.nextInt();
//
//                for (int j=0; j<listCount; j++){
//                    System.out.println("Enter teamsIds of "+val[k]+" list");
//                    if(k==0){
//                        teams[i].addToPrefferedTeamIds(sc.nextInt());
//                    }else if(k==1){
//                        teams[i].addToToleratedTeamIds(sc.nextInt());
//                    }else{
//                        teams[i].addToNoWayTeamIds(sc.nextInt());
//                    }
//                }
//            }
//        }

        int numberOfTeams = 11;
        Team[] teams = new Team[numberOfTeams];
        teams[0] = new Team();
        teams[0].teamId = 0;
        teams[0].strength = 22;
        teams[0].remainingStrength = 22;
        teams[0].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(1, 3, 5, 10)));
        teams[0].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(2, 7, 9)));
        teams[0].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(4, 6, 8)));

        teams[1] = new Team();
        teams[1].teamId = 1;
        teams[1].strength = 45;
        teams[1].remainingStrength = 45;
        teams[1].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 2, 4)));
        teams[1].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(5,6,10)));
        teams[1].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(3,7,8,9)));

        teams[2] = new Team();
        teams[2].teamId = 2;
        teams[2].strength = 34;
        teams[2].remainingStrength = 34;
        teams[2].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 1, 10)));
        teams[2].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(6)));
        teams[2].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(3, 4, 5, 7, 8, 9)));

        teams[3] = new Team();
        teams[3].teamId = 3;
        teams[3].strength = 51;
        teams[3].remainingStrength = 51;
        teams[3].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(9)));
        teams[3].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(0, 2)));
        teams[3].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(1, 4, 5, 6, 7, 8, 10)));

        teams[4] = new Team();
        teams[4].teamId = 4;
        teams[4].strength = 11;
        teams[4].remainingStrength = 11;
        teams[4].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 1, 2, 3)));
        teams[4].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(8, 9, 10)));
        teams[4].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(5, 6, 7)));

        teams[5] = new Team();
        teams[5].teamId = 5;
        teams[5].strength = 37;
        teams[5].remainingStrength = 37;
        teams[5].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(6, 9)));
        teams[5].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(0, 7)));
        teams[5].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 8, 10)));

        teams[6] = new Team();
        teams[6].teamId = 6;
        teams[6].strength = 42;
        teams[6].remainingStrength = 42;
        teams[6].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5)));
        teams[6].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(9, 10)));
        teams[6].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(7, 8)));

        teams[7] = new Team();
        teams[7].teamId = 7;
        teams[7].strength = 16;
        teams[7].remainingStrength = 16;
        teams[7].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 9)));
        teams[7].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(1,3,10)));
        teams[7].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(2, 4, 5, 6, 8)));

        teams[8] = new Team();
        teams[8].teamId = 8;
        teams[8].strength = 29;
        teams[8].remainingStrength = 29;
        teams[8].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 4)));
        teams[8].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(1, 9)));
        teams[8].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(2, 3, 5, 6, 7, 10)));

        teams[9] = new Team();
        teams[9].teamId = 9;
        teams[9].strength = 56;
        teams[9].remainingStrength = 56;
        teams[9].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(1, 5, 6, 10)));
        teams[9].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(3, 4, 7)));
        teams[9].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(0, 2, 8)));

        teams[10] = new Team();
        teams[10].teamId = 10;
        teams[10].strength = 49;
        teams[10].remainingStrength = 49;
        teams[10].addSetToPrefferedTeamIds(new HashSet<Integer>(Arrays.asList(0, 3, 4)));
        teams[10].addSetToToleratedTeamIds(new HashSet<Integer>(Arrays.asList(1, 2, 5, 6, 8, 9)));
        teams[10].addSetToNoWayTeamIds(new HashSet<Integer>(Arrays.asList(7)));

        for (int i=0;i<numberOfTeams; i++){
            teams[i].updateNoWayInBoth(teams);
        }

        AllocateTeamsToFloors.allocateTeamsToFloors(floors, teams);
    }
}