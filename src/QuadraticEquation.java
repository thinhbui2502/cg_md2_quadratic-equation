public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double r1;
        return r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double r2;
        return r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
    }
}
