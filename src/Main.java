import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = num -> Math.sqrt(num);
        System.out.println(sqrt.apply(21.5));
    }

    public static UnaryOperator<Double> sqrt() {
        return num -> Math.sqrt(num);
    }
    }
