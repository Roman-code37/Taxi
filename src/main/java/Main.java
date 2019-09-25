public class Main {
    public static void main(String[] args) {
        DistanceService service = new DistanceService();
        int prediction = service.predict (60, 20, 1000, 5, 100, 60, 60 );
        System.out.println(prediction);

    }
}
