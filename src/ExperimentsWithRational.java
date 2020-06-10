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



    }

}
