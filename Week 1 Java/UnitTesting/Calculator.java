public class Calculator {
    public int sum(String expression) {
        int sum = 0;
        for (String i : expression.split("\\+")) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}