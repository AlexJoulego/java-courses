public class ArgRunner {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[2]);
		String op = args[1];
		Calculator calc = new Calculator();

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
	}
}