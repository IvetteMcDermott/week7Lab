package week7Lab.Cinema;

public class Cinema {
    // vars
    private int numTA;
    private int numTK;
    private int under;
    private int over;
    private int total;
    private int totalTA;
    private int totalTK;
    private String msg;

    // constructor
    public Cinema() {
        numTA = 0;
        numTK = 0;
        under = 10;
        over = 15;
        total = 0;
        totalTA = 0;
        totalTK = 0;
        msg = "";
    }

    // set
    public void setNumTA(int numTA) {
        this.numTA = numTA;
    }

    public void setNumTK(int numTK) {
        this.numTK = numTK;
    }

    public void setUnder(int under) {
        this.under = under;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeTotal() {
        totalTA = numTA * over;
        totalTK = numTK * under;
        total = totalTA + totalTK;
    }

    // get
    public int getTotalI() {
        return total;
    }

    public String getTotalM() {
        return msg;
    }

    public int getOver() {
        return over;
    }

    public int getUnder() {
        return under;
    }
}
