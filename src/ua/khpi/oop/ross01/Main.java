package ua.khpi.oop.ross01;

public class Main {
	static int bookNum = 0x1A1E;
	static long phoneNum = 380501111111L;
	static int lastTwoNums = 0b1011;
	static int lastFourNums = 011;
	static int calc = (15-1 % 26) +1;
	static char symbol = 'O';
	static int even, odd;
	static int one,zero;
	static String s = "15380501111111111115";
	static String s2 = "1111101100010010111101000100011000101000111101110111111";





	public static void main(String[] args) {
		for (int i = 0; i < s.length(); i++)
			if ((s.charAt(i) - '0') % 2 == 0) even++;
			else odd++;
		System.out.println("odd: "  + odd + " even: " + even);
		for (int i = 0; i < s2.length(); i++)
			if ((s2.charAt(i) - '0')  == 1) one++;
			else zero++;
		System.out.println("one: "  + one + " zero: " + zero);
	}

}
