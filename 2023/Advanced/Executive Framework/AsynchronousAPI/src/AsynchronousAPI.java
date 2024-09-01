public class AsynchronousAPI {

    public static void show() {
        var service = new MailService();
        service.sendAsync();
        System.out.println("Hello World");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
