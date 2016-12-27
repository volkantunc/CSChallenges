public class ConvertStringToInteger {
	
	public static void main(String[] args) {
		
		//You can change the parameter of this below function as you want.
		int number = stringToIntegerHarder("22");
		System.out.println("Number:" + number);
	}

	//this is the common solution about this conversion.
	private static int stringToIntegerNormally(String str) {
		return Integer.parseInt(str);
	}

	//this also not common solution as you see.
	private static int stringToIntegerHarder(String str) {
		int returnInt = 0;

		boolean isNegative = false;
		int index = 0;

		char[] strCharArray = str.toCharArray();
		int stringLenght = strCharArray.length;

		if (strCharArray[0] == '-') {
			isNegative = true;
			index++;
		}
		
		for(int x=index; x < stringLenght; x++) {
			returnInt = returnInt*10;
			returnInt += strCharArray[x]-'0';
		}

		return isNegative ? -1*returnInt : returnInt;
	}

}
