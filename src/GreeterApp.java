import java.util.Arrays;
import java.util.Scanner;

public class GreeterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a greeting: ");
        String greeting = scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("How much volume to add? (0 to 10):");
        int volume = scanner.nextInt();
        volume = volume > 10 ? 10 : Math.max(volume, 0);
        scanner.nextLine();
        System.out.println("Enter an HTML tag (no brackets):");
        String tag = scanner.nextLine();

        Greeter greeter = new Greeter(greeting);
        SimonGreeter simonGreeter = new SimonGreeter(greeting);
        LoudGreeter loudGreeter = new LoudGreeter(greeting);
        for (int i = 0; i < volume; i++) {
            loudGreeter.addVolume();
        }
        HtmlGreeter htmlGreeter = new HtmlGreeter(greeting, tag);

        Greeter[] greeters = { greeter, simonGreeter, loudGreeter, htmlGreeter };

        Arrays.stream(greeters).forEach(g -> System.out.println(g.greet(name)));
    }
}
