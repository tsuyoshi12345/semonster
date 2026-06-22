public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster GAME");
    System.out.println("Show a new monster!");

    Player player = new Player();

    player.drawMonsters();
    player.showDeck();
  }
}
