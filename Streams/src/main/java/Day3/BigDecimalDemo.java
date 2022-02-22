package Day3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d1 = 174.12;
        double d2 = 174.01;
        System.out.println(d1-d2);

        BigDecimal b1 = new BigDecimal("174.12");
        BigDecimal b2 = new BigDecimal("174.01");
        System.out.println(b1.subtract(b2));

        //when we need to use double use BigDecimal class

        //Scaling and rounding
        BigDecimal num1 = new BigDecimal("23.12");
        System.out.println(num1.setScale(1, RoundingMode.CEILING));

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("4")));

        //BigDecimals are immutable - cannot change

    }
}
