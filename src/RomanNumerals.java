
public class RomanNumerals {
	
	private int convertedNumber=0;
	
	public int convertToInteger(String romanNum) {
		String [] parts = romanNum.split("");
		for (int i=0; i<parts.length; i++){
				if (parts[i].equals("I"))
					convertedNumber = convertedNumber + 1;
				if (parts[i].equals("V")){
					convertedNumber = 5;
					if (romanNum.length() > 1 && parts[i-1].equals("I")){
						convertedNumber = convertedNumber - 1;
					}
					else if (romanNum.length() > 1 && parts[i+1].equals("I")){
						convertedNumber = convertedNumber + 1;
						break;
					}
				}
				
				if (parts[i].equals("X"))
					convertedNumber = convertedNumber + 10;
		}
		return convertedNumber;
	}
	
}
