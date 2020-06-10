public class Rational {
    // STATIC
    //private fields
    private static final int ZERO = 0;
    private static final int ONE = 1;

    //private methods
    private static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    // NON-STATIC
    // private fields
    private int n;
    private int d = 1;

    // public constructors
    public Rational(int n, int d) {
        this.n = n;
        if (d > 0)
            this.d = d;
        else
            System.out.println("Warning!\nЗнаменатель заменен на 1. Введите положительный знаменатель.");
        simplify();
    }

    public Rational(int n) {
        this.n = n;
    }

    public Rational add(Rational r) {
        int a = this.n * r.d + r.n * this.d;
        int b = this.d * r.d;
        Rational result = new Rational(a, b);
        result.simplify();
        return result;
    }

    public Rational sub(Rational r) {
        int a = this.n * r.d - r.n * this.d;
        int b = this.d * r.d;
        Rational result = new Rational(a, b);
        result.simplify();
        return result;
    }

    public Rational mul(Rational r) {
        int a = this.n * r.n;
        int b = this.d * r.d;
        Rational result = new Rational(a, b);
        result.simplify();
        return result;
    }

    public Rational div(Rational r) {
        if (r.n != 0) {
            int a = this.n * r.d;
            int b = this.d * r.n;
            Rational result = new Rational(a, b);
            result.simplify();
            return result;
        }
        else {
            System.out.println("Деление на 0! Измените числитель делителя.");
            System.out.println("Новая дробь равна 0.");
            return new Rational(0);
        }
    }

    // public methods
    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setD(int d) {
        if (d > 0)
            this.d = d;
        else
            System.out.println("Изменения не применены. Введите положительный знаменатель.");
    }

    public String toString() {
        if (n == 0)
            return "0";
        else if (d == 1)
            return String.format("%d", n);
        return String.format("%d/%d", n, d);
    }

    public double toDouble() {
        return (double) n / d;
    }

    public void addInPlace(Rational r) {
        this.n = this.n * r.d + r.n * this.d;
        this.d = this.d * r.d;
        simplify();
    }

    public void subInPlace(Rational r) {
        this.n = this.n * r.d - r.n * this.d;
        this.d = this.d * r.d;
        simplify();
    }

    public void mulInPlace(Rational r) {
        this.n = this.n * r.n;
        this.d = this.d * r.d;
        simplify();
    }

    public void divInPlace(Rational r) {
        if (r.n != 0) {
            this.n = this.n * r.d;
            this.d = this.d * r.n;
            simplify();
        }
        else
            System.out.println("Деление на 0! Измените числитель делителя.");
    }

    // private methods
//    private int gcd(int a, int b) {
//        if (b == 0)
//            return Math.abs(a);
//        return gcd(b, a % b);
//    }
//
    private void simplify() {
        int c = gcd(this.n, this.d);
        this.n /= c;
        this.d /= c;
    }
}
