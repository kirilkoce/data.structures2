package DataStructures2;

import java.util.ArrayList;

public class toPower {

	public static void toPower(int size, int power) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add((int) Math.pow(i, power));
		}

		System.out.println(array);
	}

	public static void main(String[] args) {
		toPower(4, 2);
		
		

	}

}
