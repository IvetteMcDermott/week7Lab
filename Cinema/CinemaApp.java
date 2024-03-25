package week7Lab.Cinema;

import javax.swing.JOptionPane;

public class CinemaApp {
        public static void main(String[] args) {
                // variables
                int numTA;
                int numTK;
                int total;
                int over;
                int under;
                String msg;
                String input;
                String t_type;

                // objects
                Cinema tickets;
                tickets = new Cinema();

                // inputs
                JOptionPane.showMessageDialog(null,
                                "<html><font color='red'>               Welcome to our Cinema!</html>", "MovieLand",
                                JOptionPane.PLAIN_MESSAGE);

                // calling the inputs(ext file) to get the variables values
                numTA = (int) CinemaInput.TicketsInput("Over 18s:");
                numTK = (int) CinemaInput.TicketsInput("Under 18s:");

                // set
                tickets.setNumTA(numTA);
                tickets.setNumTK(numTK);

                // compute
                tickets.computeTotal();

                // get
                total = tickets.getTotalI();
                msg = tickets.getTotalM();
                over = tickets.getOver();
                under = tickets.getUnder();

                // output
                JOptionPane.showMessageDialog(null,
                                "\nTotal Price:  €" + total + "\n" + "\nTickets O. 18s Qty: " + numTA + " * "
                                                + "each € " + over + "\n"
                                                + "Tickets U. 18s Qty: " + numTK + " * " + "each € " + under + "\n",
                                "Your cart", JOptionPane.PLAIN_MESSAGE);
        }
}
