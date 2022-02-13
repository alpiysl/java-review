import java.util.ArrayList;

public class Team<T extends Player> {
//    T is type -> define a type (type checking)
//    we dont want every one join the team
//    Team<T extends Player> this means we can only have Player types now
    private ArrayList<T> members = new ArrayList<>();

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

}
