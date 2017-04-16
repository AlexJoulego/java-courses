import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Choose operator: ");
				String op = reader.next();
				int a = Integer.valueOf(first);
				int b = Integer.valueOf(second);

				switch (op) {
					case "+":
					  calc.add(a, b);
					  break;
					case "-":
					  calc.sub(a, b);
					  break;
					case "*":
					  calc.mul(a, b);
					  break;
					default:
					  System.out.println("Wrong operator!");
				}

				System.out.println("Result: " + calc.getResult());				
				System.out.println("Exit? yes/no ");
				exit = reader.next();
				System.out.println("Clean the result? ");
				String answer = reader.next();
				if (answer.equals("yes")) {
					calc.cleanResult();
				}
			}
		} finally {
			reader.close();
		}
	}
}