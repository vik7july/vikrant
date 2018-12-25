package program2;

import java.util.Random;

public class RandomNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int rn = r.nextInt(1000);
			System.out.println("Random Number: "+rn);
		}
	}
}