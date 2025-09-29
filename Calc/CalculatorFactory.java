package Calc;

public final class CalculatorFactory {
    private CalculatorFactory() {}
    public static Calculator create() {
        return new Calculator(); // or Calculator.getInstance() if you later switch to Singleton
    }
}
