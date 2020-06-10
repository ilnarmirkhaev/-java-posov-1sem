public class Rational {
    private int n = 0;
    private int d = 1;

    public Rational(int n, int d) {
        if (d > 0) {
            int c = gcd(n, d);
            this.n = n / c;
            this.d = d / c;
        }
        else {
            this.n = n;
            System.out.println("Warning!\nЗнаменатель заменен на 1. Введите положительный знаменатель.");
        }
    }

    public Rational(int n) {
        this.n = n;
    }

    public String toString() {
        if (n == 0)
            return "0";
        else if (d == 1)
            return String.format("%d", n);
        return String.format("%d/%d", n, d);
    }

    public double toDouble() {
        double num = n;
        return num/d;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    public void addInPlace(Rational r) {
        int c = gcd(this.d, r.d);
        this.n = (this.n * r.d + r.n * this.d) / c;
        this.d = this.d * r.d / c;
    }

}
