public class ExperimentsWithRational {

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 6);
        Rational r2 = new Rational(2, 6);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r2.toDouble());

        System.out.println("----------------");

        r1.addInPlace(r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println("----------------");

        Rational r3 = new Rational(4);
        System.out.println(r3.toString());
        r3.subInPlace(r1);
        System.out.println(r3.toString());

        System.out.println("----------------");

        Rational r4 = r3.add(r2);
        System.out.println(r4.toString());
        System.out.println(r4.toDouble());

        System.out.println("----------------");


    }

}
