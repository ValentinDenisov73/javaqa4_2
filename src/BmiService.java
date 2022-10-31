public class BmiService {
    public double calculate(double bodyMass, double height) {
        double bmi = bodyMass / Math.pow(height, 2);
        return bmi;
    }
}
