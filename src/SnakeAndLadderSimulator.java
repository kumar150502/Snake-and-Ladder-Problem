import java.util.Random;
public class SnakeAndLadderSimulator {
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {
        Random random = new Random();
        int playerPosition = 0;
        int numberOfDiceRolls = 0;

        while (playerPosition < 100) {
            int diceRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {
                case NO_PLAY:
                    break;
                case LADDER:
                    playerPosition += diceRoll;
                    break;
                case SNAKE:
                    playerPosition -= diceRoll;
                    break;
            }

            numberOfDiceRolls++;

            if (playerPosition < 0) {
                playerPosition = 0;
            } else if (playerPosition >= 100) {
                playerPosition = 100 - diceRoll;
            }
        }

        System.out.println("Player won the game in " + numberOfDiceRolls + " dice rolls");
    }
}
