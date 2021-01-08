public class Main {
    public static void main(String[] args) {
/*        Player player = new Player();
        player.health = 20;
        player.name = "Tim";
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    */
    EnchancedPlayer player = new EnchancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}

