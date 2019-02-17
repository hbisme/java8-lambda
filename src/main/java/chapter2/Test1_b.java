package chapter2;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import javax.swing.JButton;

@FunctionalInterface
interface MathOperation {
    Double operation(Double a, Double b, String c);
}

public class Test1_b {


    public static void main(String[] args) {

        Runnable noArgument = () -> System.out.println("lambda no argument");
        noArgument.run();

        ActionListener oneArgument = event -> System.out.println("lambda in one argument");
        // oneArgument.actionPerformed();
        BinaryOperator<Long> add = (x, y) -> x + y;
        System.out.println(add.apply(1L, 2L));

        MathOperation computer = (Double x, Double y, String operator) -> {
            if (operator.equals("+")) {
                return x + y;
            } else   {
                return x - y;
            }
        };

        System.out.println(computer.operation(2D, 3D, "+"));

        // MathOperation subtraction = (a, b) -> a - b;

        JButton jButton = new JButton();
        jButton.addActionListener(event -> System.out.println(event.getActionCommand()));

        String[] arr = new String[]{"a", "b", "c"};
        Arrays.stream(arr).filter(x -> x.equals("a")).forEach(x -> System.out.println(x));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        // list.stream().filter(x -> x == 1).forEach(x -> System.out.println(x));


         // noArgument2 = () -> System.out.println("lambda no argument");



    }

}


