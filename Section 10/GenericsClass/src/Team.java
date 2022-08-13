import java.util.ArrayList;

// Bounding = <T>
// Extending so that we don't have to cast (Player) in the addPlayer method!
// Restrict the type of class to Player
// can also implement interfaces in bounding!
// Comparable allows comparing to same team

//public class Team<T extends Player & Coach> { // use & if you want to extend class and also implement an interface
public class Team<T extends Player> implements Comparable<Team<T>> {
//    Comparable:
//    -1  (less than)
//    0 (equals)
//    1 (greater)
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already in the name");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent !=null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2 )  + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return 1;
        } else if (this.ranking() < team.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }
}
