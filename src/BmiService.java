public class BmiService {
    public double index (double h, double w) {
        double square = h * h;
        double result = w / square;
        return result;
    }
}
