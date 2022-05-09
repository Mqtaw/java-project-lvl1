package hexlet.code;

public class Greet {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        var name = Cli.getName();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
