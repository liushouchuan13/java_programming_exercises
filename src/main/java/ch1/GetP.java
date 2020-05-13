package ch1;

public class GetP {
    public static void main(String[] args) {
        GetP getP = new GetP();
        System.out.println(getP.getC(5.5, getP));
        System.out.println(getP.getM(4.5, getP));
    }

    double getC(double r, GetP getP) {
        return 2 * r * getP.getP(2000000);
    }

    double getM(double r, GetP getP) {
        return r * r * getP.getP(2000000);
    }

    double getP(int i) {
        double pai = 0;
        double k = 1.0;
        for(int j = 1; j < i; j++) {
            if(0 == j % 2) {
                pai -= 1.0 / k;
            } else {
                pai += 1.0 / k;
            }
            k += 2.0;
        }
        return 4*pai;
    }
}
