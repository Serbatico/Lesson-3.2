public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex() ;
        int weight = 79;
        double height = 1.89;
        double bMi = service.Calculate(weight, height);

        System.out.println ("Ваш ИМТ: " + bMi);
    }
}
