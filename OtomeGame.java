import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface for interactable characters
interface Interactable {
    void interact();
}

// Interface for choices in the game
interface Choiceable {
    void makeChoice();
}

// Interface for romanceable characters
interface Romanceable {
    void romance();
}

// Character of the game
class Character implements Interactable, Romanceable {
    private String name;
    private String description;

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void interact() {
        System.out.println("You interact with " + name + ": " + description);
    }

    @Override
    public void romance() {
        System.out.println("You start to romance " + name + ". They smile at you!");
    }

    public String getName() {
        return name;
    }
}

// choice in the game
class Choice implements Choiceable {
    private String text;
    private Runnable action;

    public Choice(String text, Runnable action) {
        this.text = text;
        this.action = action;
    }

    @Override
    public void makeChoice() {
        action.run();
    }

    public String getText() {
        return text;
    }
}


public class OtomeGame {
    private List<Character> characters;
    private List<Choice> choices;
    private Scanner scanner;

    public OtomeGame() {
        characters = new ArrayList<>();
        choices = new ArrayList<>();
        scanner = new Scanner(System.in);
        setupGame();
    }

    private void setupGame() {
        // Create characters
        characters.add(new Character("Rafayel", "A charming and artistic painter."));
        characters.add(new Character("Zayne", "A cold hearted boy."));
        characters.add(new Character("Xavier", "A mysterious boy with a secret past."));

        // choices
        choices.add(new Choice("Interact with Rafayel", () -> characters.get(0).interact()));
        choices.add(new Choice("Interact with Zayne", () -> characters.get(1).interact()));
        choices.add(new Choice("Interact with Xavier", () -> characters.get(2).interact()));
        choices.add(new Choice("Romance Rafayel", () -> characters.get(0).romance()));
        choices.add(new Choice("Romance Zayne", () -> characters.get(1).romance()));
        choices.add(new Choice("Romance Xavier", () -> characters.get(2).romance()));
    }

    public void start() {
        System.out.println("Welcome to the Otome Game!");
        while (true) {
            System.out.println("\nChoose an action:");
            for (int i = 0; i < choices.size(); i++) {
                System.out.println((i + 1) + ". " + choices.get(i).getText());
            }
            System.out.println("Enter the number of your choice (or '0' to exit):");

            int choiceIndex = scanner.nextInt() - 1;
            if (choiceIndex == -1) {
                System.out.println("Thanks for playing!");
                break;
            } else if (choiceIndex >= 0 && choiceIndex < choices.size()) {
                choices.get(choiceIndex).makeChoice();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        OtomeGame game = new OtomeGame();
        game.start();
    }
}