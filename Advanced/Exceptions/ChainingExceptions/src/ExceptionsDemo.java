public class ExceptionsDemo {
    public static  void show() {
        var account = new Account();
        try {
            account.deposit(10);
            account.withdraw(5);
        } catch (AccountException e) {
           var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
