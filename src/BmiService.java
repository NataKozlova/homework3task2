public class BmiService {
    public int calculate(int weightPerKg, double heightPerM) {

        int bmi = (int) (weightPerKg / (heightPerM * heightPerM));
        return bmi;

    }


}
