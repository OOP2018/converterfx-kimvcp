package converter;

public class Test {
	public static void main(String[] args) {
		// example how to get the values
		Length[] lengths = Length.values();
		// use the values
		for (Length x : lengths)
			System.out.println(x.toString() + " = " + x.getValue());
	}
}
