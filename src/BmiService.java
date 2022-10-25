public class BmiService {
    public double calculate(double m, double h) {
        double b = m / Math.pow(h, 2);
        return b;
    }
}
