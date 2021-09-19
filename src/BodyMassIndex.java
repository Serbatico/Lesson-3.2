public class BodyMassIndex {
    public static double Calculate (int weight, double height) {


        double result = weight / Math.pow(height, 2);

        return result;
    }
}
