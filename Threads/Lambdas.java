public class Lambdas {
    public static void main(String[] args) {
        //Old way - Anonymous function
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Get off my lawn");
            }
        };

        r1.run();

        //New way - Lambdas
        Runnable r2 = () -> System.out.println("The future is now");

        r2.run();
    }
}