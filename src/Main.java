public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 82;
        int height = 178;
        float pmi = service.calculate(mass, height);
        System.out.println(pmi);
    }
}