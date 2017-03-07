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
    public void iveskForSin(){
    	System.out.println("Ivesk skaicius operacijai");
    	a= reader.nextDouble();   	
    }

    @Override
    public double add() {
    	ivesk();
        return a + b;
    }

    @Override
    public double subtract() {
    	ivesk();
        return a - b;
    }

    @Override
    public double multiply() {
    	ivesk();
        return a * b;
    }

    @Override
    public double divide() {
    	ivesk();
        return a / b;
    }

    @Override
    public double power() {
    	ivesk();
        return Math.pow(a, b);
    }

	@Override
	public double makeSin() {
		iveskForSin();
		return Math.sin(Math.toRadians(a));
	}

	@Override
	public double makeCos() {
		iveskForSin();
		return Math.cos(Math.toRadians(a));
	}

	@Override
	public double makeTg() {
		iveskForSin();
		return Math.tan(Math.toRadians(a));
	}

	@Override
	public double makeCtg() {
		iveskForSin();
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
                + "sin to Sinus \n"
                + "cos to Cosinus \n"
                + "tan to Tangent \n"
                + "ctan to Ctangent \n"
                + "================ \n"
                + "i to print instructions \n"
                + "x to exit \n");
    }
}
