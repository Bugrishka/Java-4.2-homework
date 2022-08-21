public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.75;
        int weight = 55;
        double indexBody = service.index (height, weight);
        System.out.format("Индекс массы тела: %.2f - ", indexBody);
        if (indexBody <= 18) {
            System.out.println("Недостаток веса 2й степени!");
        }
        if (indexBody > 18 && indexBody <= 20) {
            System.out.println("Недостаток веса 1й степени!");
        }
        if (indexBody > 20 && indexBody <= 25) {
            System.out.println("Нормальный вес.");
        }
        if (indexBody > 25 && indexBody <= 27) {
            System.out.println("Лишний вес.");
        }
    }
}
