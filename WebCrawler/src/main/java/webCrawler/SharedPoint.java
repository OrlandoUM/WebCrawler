package webCrawler;

import java.util.ArrayList;

public class SharedPoint {
	
	private static boolean j = false;
	private static ArrayList<Copa> array = new ArrayList<Copa>();
	private static int counter = 0;
	
	private SharedPoint() {}
	
	public static int getCounter() {
		return counter;
	}
	
	public static void setCounter(int i) {
		counter = i;
	}
	
	public static boolean getJ() {
		
		return j;
	}
	
	public static void setJ(boolean b) {
		
		j = b;
	}
	
	public static ArrayList<Copa> getArray(){
		
		return array;
	}
	
	public static void setArray(ArrayList<Copa> copa) {
		array = copa;
	}
	
	public static void incrementArray(Copa c) {
		array.add(c);
	}
	
	public static Copa getArrayFromIndex(int i) {
		Copa c = array.get(i);
		//array.remove(i);
		return c;
	}
	
	
}