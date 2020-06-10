public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(3, 7);
        Rational r2 = new Rational(10,25);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r2.toDouble());
        r1.addInPlace(r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
