package conditionsANDbooleans;
import java.util.Scanner;

public class ConditionsAndBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "hello";
		String y = "hellO";
		int z = 10;
		int q = 15;
		int w = 13;
		// > < == >= <= !=
		
		boolean compare = x != y || x == y;
		boolean kompare = (q > w && z < q);
		
		System.out.println(compare);
		System.out.println(kompare);

	}

}
