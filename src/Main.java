public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightPerKg = 105;
        double heightPerM = 0.78;
        int bmi = service.calculate(weightPerKg,heightPerM);

        System.out.println("bmi:" + bmi);
    }
}