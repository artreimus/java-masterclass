public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

//        FootballPlayer banks = new FootballPlayer("Gordon");

        FootballPlayer joe = new FootballPlayer("Joe");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows"); //Generics
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(melbourne);
        footballLeague.add(adelaideCrows);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
//        hawthorn.matchResults(fremantle, 1, 0);?
        footballLeague.showLeagueTable();
    }
}