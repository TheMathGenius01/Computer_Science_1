import static java.lang.System.*;

public class RomanNumeral {
	private int number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str) {
		roman = str;
		number = toNumber(str);
	}

	public RomanNumeral(Integer orig) {
		number = orig;
		roman = toRoman(orig);
	}

	public void setNumber(Integer num) {
		number = num;
		roman = toRoman(num);
	}

	public void setRoman(String rom) {
		roman = rom;
		number = toNumber(rom);
	}

	public Integer getNumber() {
		return number;
	}

	public String toString() {
		return roman + "\n";
	}

	private String toRoman(int number) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < NUMBERS.length; i++) {
			while (number >= NUMBERS[i]) {
				result.append(LETTERS[i]);
				number -= NUMBERS[i];
			}
		}
		return result.toString();
	}

	private int toNumber(String roman) {
		int result = 0;
		for (int i = 0; i < LETTERS.length; i++) {
			while (roman.startsWith(LETTERS[i])) {
				result += NUMBERS[i];
				roman = roman.substring(LETTERS[i].length());
			}
		}
		return result;
	}

}
