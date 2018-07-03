import com.revature.math.Calculator;

public class Main {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);

        Calculator c = new Calculator(a, b, args[1].charAt(0));
        c.calculate();

        /*
        switch(args[1].charAt(0)) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case 'x': System.out.println(a * b); break;
            case '/': System.out.println(a / (double)b); break;
            default: System.out.println("Error");
        }
        */
        
    }
}