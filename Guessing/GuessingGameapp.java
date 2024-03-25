package week7Lab.Guessing;

import javax.swing.JOptionPane;

public class GuessingGameapp {

    public static void main(String[] args) {
        // variables
        int num;
        int play;
        String msg;
        String msgF;
        String guessed;
        int[] history = new int[20];

        // objects
        GuessingGame GG;
        GG = new GuessingGame();

        // Start input
        JOptionPane.showMessageDialog(null,
                "<html><font color='green'>Rules</html>\nYou have 3 attemps by game.\nComputer gets a new number each time.",
                "Let's Play", 1);

        // Initialize variables
        num = 0;
        msgF = "";
        play = 0;

        // set
        GG.setPlay(play);
        GG.setNum(num);

        // compute
        GG.computeGuessG();
        GG.computePlay();

        // get
        msg = GG.getMsg();
        msgF = GG.getMsgF();
        history = GG.getHistory();
        guessed = GG.getGuessed();

        // compute
        // GG.computePlay();

        // output

        if (msg == "") {
            GuessingGameOutput.toPrint(msgF);

        } else {
            GuessingGameOutput.toPrint(msg);

        }

    }
}
