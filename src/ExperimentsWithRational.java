public class ExperimentsWithRational {

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 6);
        Rational r2 = new Rational(3, 9);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        r1.addInPlace(r2);
        System.out.println(r1.toString());

        System.out.println("----------------");

        Rational r3 = new Rational(3, 5);
        Rational r4 = new Rational(1, 4);

        r3.subInPlace(r4);
        System.out.println(r3.toString());

        r2.divInPlace(r1);
        System.out.println(r2.toString());

        Rational r5 = r3.mul(r2);
        System.out.println(r5.toString());

        Rational r6 = r5.div(r1);
        System.out.println(r6.toString());
        System.out.println(r6.toDouble());

        System.out.println("----------------");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());
        System.out.println(r6.toString());
        System.out.println("----------------");

        r4.setN(3);
        r4.setD(1);
        r2.mulInPlace(r4);
        System.out.println(r4.toString());
        System.out.println(r2.toString());

        System.out.println("----------------");

        Rational r7 = r5.add(r6);
        System.out.println(r7.toString());
        Rational r8 = r7.sub(r1);
        System.out.println(r8.toString());

        System.out.println("----------------");

        for(int i = 0; i <= 21; i++)
            System.out.printf("%d - %f\n", i, sumOfRationals(i));

    }

    public static double sumOfRationals(int n) {
        if (n < 1)
            return 0;
        else {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += new Rational(1, i).toDouble();
            }
            return sum;
        }
        // хранение суммы в переменной типа double, а не в Rational решает проблему
        // подозреваю, что изменение int на long в классе Rational тоже, но пробовать не хочется
    }
}
