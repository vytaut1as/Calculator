
public class CalculatorEngine implements IBasicFunctionality, Itrigonometrija {

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

	@Override
	public double makeSin() {
		// TODO Auto-generated method stub
		return Math.sin(Math.toRadians(a));
	}

	@Override
	public double makeCos() {
		// TODO Auto-generated method stub
		return Math.cos(Math.toRadians(a));
	}

	@Override
	public double makeTg() {
		// TODO Auto-generated method stub
		return Math.tan(Math.toRadians(a));
	}

	@Override
	public double makeCtg() {
		// TODO Auto-generated method stub
		return 1 / Math.tan(Math.toRadians(a));
	}
}
