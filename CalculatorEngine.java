
public class CalculatorEngine implements IBasicFunctionality {

    private double a;
    private double b;

    @Override
    public double add() {
        return a + b;
    }

    @Override
    public double subtract() {
        return a - b;
    }

    @Override
    public double multiply() {
        return a * b;
    }

    @Override
    public double divide() {
        return a / b;
    }

    @Override
    public double power() {
        return Math.pow(a, b);
    }
}
