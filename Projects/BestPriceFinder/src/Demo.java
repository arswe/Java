public class Demo {
    public static void show() {
        var service = new FlightService();
        service.getQuote("site 1")
                .thenAccept(System.out::println);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
