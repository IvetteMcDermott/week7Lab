package week7Lab.Guessing;

public class GuessingGame {

    // vars
    private int num;
    private int play;
    private String msgF;

    private String guessed;

    private int pc_num;
    private String msg;
    private String msgL;
    private int i;
    private int ind;
    private int[] history = new int[20];

    private int counterGames;
    private int counterWon;

    // constructor
    public GuessingGame() {
        num = 0;
        pc_num = 0;

        msg = "";
        msgF = "";
        guessed = "";
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPcNum(int pc_num) {
        this.pc_num = pc_num;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    // compute

    public void computePlay() {
        // zero is option yes to replay
        if (play == 0) {
            computeGuessG();
            play = GuessingGameInput.PlayAgain();
            computePlay();
        } else {
            // all the print to exit the game
            GuessingGameOutput
                    .toPrint("Your input numbers were \n" + guessed + "\n\nYou played " + counterGames + " games\nWon "
                            + counterWon);
            GuessingGameOutput.toPrint("Ok, bye for now.");
            System.exit(0);
        }
    }

    public void computeGuessG() {
        counterGames += 1;
        i = 0;
        // 3 attemps per game
        while (i < 3) {
            pc_num = (int) (Math.random() * 10) + 1;

            // This line is to test is working proper as we can see the pc_num before
            // ask to input user guess
            System.out.println("pc" + pc_num);

            // starts the number input
            num = (int) GuessingGameInput.GuessNumber();

            // find the index of a element to replace
            for (int i = 0; i < history.length; i++) {
                if (history[i] == 0) {
                    // the int to be use as index
                    ind = i;
                }
            }

            // add the num to the array
            history[ind] = num;

            // turn it to a string
            guessed = guessed + " " + Integer.toString(num);

            // evaluate if guessed or not
            if (num == pc_num) {
                msg = "<html><font color='blue'>You guessed!</html>\nIt was " + num;
                counterWon += 1;
                // print the message
                GuessingGameOutput.toPrint(msg);

                // ends the program if guessed
                play = GuessingGameInput.PlayAgain();
                computePlay();
            } else {
                // returns the guess left
                if (i == 2) {
                    msgL = "You lose the game!";
                } else {
                    msgL = "<html><font color='red'>Wrong!</html>" + "\nPc number was " + pc_num + " \n\nGuess left: "
                            + (2 - i);
                }
                GuessingGameOutput.toPrint(msgL);
                // counter for attempts
                i++;
            }
        }
        play = GuessingGameInput.PlayAgain();

        computePlay();

    }

    // get
    public String getMsg() {
        return msg;
    }

    public String getMsgF() {
        return msgF;
    }

    public String getGuessed() {
        return guessed;
    }

    public int[] getHistory() {
        return history;
    }

}