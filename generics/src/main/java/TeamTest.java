public class TeamTest {

    public static void main(String[] args) {
    FootBallPlayer joe = new FootBallPlayer("Joe");
    BaseBallPlayer pay = new BaseBallPlayer("pay");
    SoccerPlayer bash = new SoccerPlayer("bash");

    Team<SoccerPlayer> gs = new Team<>("GalataSaray");
//    gs.addPlayer(joe);
//    gs.addPlayer(pay);
        gs.addPlayer(bash);

//    Team<String> tt = new Team<>("TT"); -> even if String is an object we can not add except Player
//    because we restricted it in Team class with Team<T extends Player>

        System.out.println(gs.numPlayers());
    }
}
