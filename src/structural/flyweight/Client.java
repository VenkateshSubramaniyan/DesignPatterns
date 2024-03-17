package structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();

        game.addTree(1, 3, "green");
        game.addTree(2, 5, "brown");
        game.addTree(4, 8, "green");
        game.addTree(4, 9, "green");
        game.addTree(5, 3, "brown");
    }
}

