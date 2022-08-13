public class Main {
//    The earlier the bug is detected the cheaper it is to fix!
//    Generic classes: uses <>
//    Uses <T> in actual class


    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows"); //Generics
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayer());

        Team<SoccerPlayer> soccerTeam = new Team<>("Chicago Cubs");
        soccerTeam.addPlayer(beckham);
        System.out.println(soccerTeam.numPlayer());

//        Team <String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("none");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResults(fremantle, 1, 0);
        hawthorn.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2, 1);
//        adelaideCrows.matchResults(baseballTeam, 1, 1 ); // doesnt work because adelaideCrows is a football team
        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}