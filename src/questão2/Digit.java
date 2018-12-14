package questão2;

public class Digit {

	public long rearranjo(Long numero) {
		if(numero == null) {
			return 0;
		}
		String num = numero.toString();
		if(num.length() == 1 || num.length() == 2) {
			if(num.contains("0")) {
				return 1;
			}
			return 2;
		}
		
		String stringModified = modify(num);
		int size = stringModified.length();
		int zeros = countZeros(num);		
		
		return (size*2) - (zeros * 2);
		
	}
	
	private int countZeros(String num) {
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i) == 0)
				count++;
		}
		return count;
	}

	private String modify(String num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i) != '0')
				sb.append(num.charAt(i));
		}
		return sb.toString();
	}
}
