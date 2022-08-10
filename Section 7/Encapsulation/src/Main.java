public class Main {
//    Always set the fields to private
//    Set the values using constructors!

//    Player = incorrect; EnhancedPlayer = correct! (encapsulated)
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Art";
        player.health = 20;
        player.weapon = "Spear";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());
        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Arthur", 50, "shield");
        System.out.println(enhancedPlayer.getHitPoints());
        enhancedPlayer.loseHealth(50);
        System.out.println(enhancedPlayer.getHitPoints());
    }
}