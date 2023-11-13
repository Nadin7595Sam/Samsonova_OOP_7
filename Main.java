public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();

        ComplexNumber a = new ComplexNumber(2.0, 3.0);
        ComplexNumber b = new ComplexNumber(1.0, 2.0);

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);
    }
}