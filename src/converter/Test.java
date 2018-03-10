package converter;
/**
 * Test class for getting length of value.
 * 
 * @author Vichaphol Thamsuthikul
 *
 */
public class Test {
	public static void main(String[] args) {
		// example how to get the values
		Length[] lengths = Length.values();
		// use the values
		for (Length x : lengths)
			System.out.println(x.toString() + " = " + x.getValue());
	}
}
