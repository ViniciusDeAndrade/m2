package questão2;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Digit digit = new Digit();
		
		long rearranjo = digit.rearranjo(new BigDecimal(432).longValue());
		System.out.println(rearranjo);
		
	}
}
