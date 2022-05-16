public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        GuessTheNumber guessTheNumber = new GuessTheNumber(printer);

        guessTheNumber.runGame();
    }
}

