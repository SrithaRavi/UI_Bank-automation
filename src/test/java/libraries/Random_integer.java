package libraries;

import java.util.Random;

public class Random_integer {
	
	public void getRandomIntNumber(int start,int end) {
		Random ran = new Random();
		int result = ran.nextInt((end - start)+1) + 1;
		//return result;
	}

}
