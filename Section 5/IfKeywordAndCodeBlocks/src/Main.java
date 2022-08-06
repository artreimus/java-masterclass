public class Main {
//    You don't have to invoke { } codeblocks if the "if" statement is only 1 line
//    If it is more than one line, use the codeblocks.
//    If you use else if / else, use codeblocks too :)
//    If -> Else if -> Else
//    Variables declared inside the if statement are "block scoped"
//    Methods are block scope
//    Method must always have "private/public/protected and static"
//    Method parameters needs a type and the name "e.g: boolean gameOver"
//    Method with void doesnt "return" anything
//    Use datatype in method that you want 2 return example : int methodName() (returns an int)
//    -1 means an error in programming

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5100;
        int levelCompleted = 5;
        int bonus = 100;
        int newValue = calculateScore(false, score, levelCompleted, bonus);
        calculateScore(true, 1000, 3, 99);
        System.out.println("New Value:  " + newValue);


        String playerName = "Arthur";
        int playerScore = 1500;
        displayHighScorePosition ("Arthur", calculateHighScorePosition(playerScore));
        playerScore = 900;
        displayHighScorePosition ("Arthur", calculateHighScorePosition(playerScore));
        playerScore = 400;
        displayHighScorePosition ("Arthur", calculateHighScorePosition(playerScore));
        playerScore = 50;
        displayHighScorePosition ("Arthur", calculateHighScorePosition(playerScore));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else return -1;
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position " + highScorePosition + " on the high score table!");
    }
    public static int calculateHighScorePosition (int playerScore) {
        int playerPosition = 4;
        if(playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500) {
            playerPosition = 2;
        } else if (playerScore >= 100) {
            playerPosition = 3;
        } else playerPosition = 4;
        return playerPosition;

    }
}