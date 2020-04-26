//Arshia Kohanteb - SelfDivisor - AP Comp SCI
public class SelfDivisor {

	public static boolean isSelfDivisor(int number) {
		int num = number;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			if (temp == 0) 
			{
				return false;
			}
			if (number % temp != 0) 
			{
				return false;
			}
			
			num = num / 10;
		}
		return true;
	}

	public static int[] firstNumSelfDivisors(int start, int num) {
		
		int numStored = 0;
		int nextnum = start;
		int[] selfDivisors = new int[num];
		
		for (int i = 0; i < num; i++) {
			
			while (isSelfDivisor(nextnum) == false) 
			{
				nextnum++;
			}
			
			selfDivisors[numStored] = nextnum;
			numStored++;
			nextnum++;
		}
		return selfDivisors;
	}
}
