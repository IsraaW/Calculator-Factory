package Calc;

final class DivOperation implements Operation {
    @Override public double apply(double a, double b) {
        return a / b; // retain your divide-by-zero policy in Calculator.compute()
    }
}
