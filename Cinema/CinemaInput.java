package week7Lab.Cinema;

import javax.swing.JOptionPane;

public class CinemaInput {
    public static int TicketsInput(String t_type) {

        // variables
        String input;
        int num;

        // initialize
        num = 0;

        // input
        input = JOptionPane.showInputDialog(null, t_type, "Tickets to purchase", JOptionPane.PLAIN_MESSAGE);

        if (input != null && !input.isEmpty()) {
            // pass the input to int
            num = Integer.parseInt(input);

        } else {
            // if its empty gives a message and a new opportunity to fill or it will
            // assign the value to 0/ initial value
            JOptionPane.showMessageDialog(null,
                    "Input can not be empty,\nenter a number for tickets of this type \nor it will be consider 0");
            input = JOptionPane.showInputDialog(null, t_type, "Tickets to purchase", JOptionPane.PLAIN_MESSAGE);
            num = Integer.parseInt(input);

        }

        return num;

    }
}
