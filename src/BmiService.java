public class BmiService {
    public float calculate(float mass, float height) {
        float pmi = mass / (height / 100 * height / 100);
        return pmi;
    }
}