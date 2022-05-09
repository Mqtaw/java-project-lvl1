package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        var choice = Cli.getGame();
        System.out.println();

        String name;
        switch (choice) {
            case 1 -> Greet.greetings();
            case 2 -> {
                name = Greet.greetings();
                Even.even(name);
            }
            default -> {
            }
        }
    }
}
