public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 72;    // масса тела в кг
        double height = 1.82;    // рост в метрах
        double bmi = service.calculate(bodyMass, height);
        System.out.println("Индекс массы тела равен " + bmi);
    }
}