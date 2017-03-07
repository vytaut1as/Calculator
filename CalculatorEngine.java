import java.util.Scanner;

public class CalculatorEngine implements IBasicFunctionality, Itrigonometrija {

    private double a;
    private double b;

	Scanner reader = new Scanner(System.in);
    
    public void ivesk(){
    	System.out.println("Ivesk du skaicius operacijai");
    	a= reader.nextDouble();
    	b= reader.nextDouble();
    	
    }

    @Override
    public double add() {
    	ivesk();
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
	public void printInstruction(){
        System.out.println("Instructions: \n" +
                "Yuo can use\n"
                + "+ to Add \n"
                + "- to Subtract \n"
                + "* to Multiply \n"
                + "/ to Divide \n"
                + "^ to Power ApowB \n"
                + "================ \n"
                + "i to print instructions \n"
                + "x to exit \n");
    }
}
