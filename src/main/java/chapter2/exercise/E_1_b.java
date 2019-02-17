package chapter2.exercise;

@FunctionalInterface
interface Computer<T> {
    T computer(T x, T y, String operate);
}

public class E_1_b {
    public static void main(String[] args) {
        Computer<Double> c = (Double x, Double y, String operator) -> {
            if ("add".equals(operator)) {
                return x + y;
            } else if ("sub".equals(operator)) {
                return x - y;
            } else {
                return 0.0;
            }
        };

        Double res = c.computer(1D, 2D, "add");
        System.out.println(res);

    }
}

