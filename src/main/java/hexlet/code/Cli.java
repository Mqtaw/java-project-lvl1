package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        return sc.nextLine();
    }

    public static String getGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        return sc.nextLine();
    }
}
