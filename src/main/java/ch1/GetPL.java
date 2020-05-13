package ch1;

public class GetPL {
    public static void main(String[] args) {
        GetPL getPL = new GetPL();
        double time = 365 * 5 * 24 * 60 * 60;
        double pl = 312032486 + getPL.getB(time) - getPL.getD(time) + getPL.getM(time);
        System.out.println(pl);
    }

    double getB(double time) {
        return time / 7;
    }

    double getD(double time) {
        return  time / 13;
    }

    double getM(double time) {
        return time / 45;
    }
}
