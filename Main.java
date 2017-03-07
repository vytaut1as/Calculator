import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
		Scanner reader = new Scanner(System.in);
        CalculatorEngine calculator = new CalculatorEngine();        
        
        calculator.printInstruction();

        while (true) {
        	
        	System.out.println("Ivesti komanda:");
        	String command = reader.nextLine();
        	if(command.equals("x")){
        		break;
        	}else if(command.equals("i")){
//        		System.out.println();
        		calculator.printInstruction();

        	}else if(command.equals("+")){
        		System.out.println(calculator.add());

	    	}else if(command.equals("-")){
	    		System.out.println(calculator.subtract());

			}else if(command.equals("*")){
				System.out.println(calculator.multiply());

			}else if(command.equals("/")){
				System.out.println(calculator.divide());

			}else if(command.equals("^")){
				System.out.println(calculator.power());

			}else if(command.equals("sin")){
				System.out.println(calculator.makeSin());

			}else if(command.equals("cos")){
				System.out.println(calculator.makeCos());

			}else if(command.equals("tan")){
				System.out.println(calculator.makeTg());

			}else if(command.equals("ctan")){
				System.out.println(calculator.makeCtg());
				
			}else{
        		System.out.println("else");
        	}
        	
        }
    }

}
