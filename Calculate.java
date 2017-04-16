public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int sum = first + second;
		int diff = first - second;
		int product = first * second;
		int ratio = first / second;
		int pow = (int)Math.pow(first, second);

		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
		System.out.println("Product = " + product);
		System.out.println("Ratio = " + ratio);
		System.out.println("Power = " + pow);
	}
}